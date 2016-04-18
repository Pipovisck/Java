/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrevista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



/**
 *
 * @author GABRIEL HADDAD
 */
public class Gui extends JFrame{
    
    private final Canal canais[];
    private final JButton bCanais[], bSexoF, bSexoM, bResultado;
    private int sexo;

    public Gui(Canal canais[]) {
        super("Pesquisa de canais");
        this.canais = canais;
        bCanais = new JButton[canais.length];
        bSexoF = new JButton("Feminino");
        bResultado = new JButton("Resultado");
        bSexoM = new JButton("Masculino");

        this.setSize(400, 400);
        this.setLayout(new GridLayout(3, 3));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        exibir();
    }

    public void exibir() {
        //Cria botoes com nomes dos canais
        votarCanal votar;
        for (int i = 0; i < canais.length; i++) {
            bCanais[i] = new JButton(canais[i].getNome());
            votar = new votarCanal(canais[i]);
            bCanais[i].addActionListener(votar);
            this.add(bCanais[i]);
            bCanais[i].setEnabled(false);
        }

        DefSex defSex = new DefSex();
        bSexoF.addActionListener(defSex);
        this.add(bSexoF);

        bSexoM.addActionListener(defSex);
        this.add(bSexoM);  
        
        Resultado resultado = new Resultado();
        bResultado.addActionListener(resultado);
        this.add(bResultado);

        this.setVisible(true);
    }

    private class DefSex implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {          
            if (e.getSource() == bSexoF) {
                sexo = 0;
            }            
            if (e.getSource() == bSexoM){
                sexo = 1;
            }
           
            //--Define sexo 0 para mulher e 1 para homem
           // sexo = (e.getSource() == bSexoF) ? 0 : 1;
            for (int i = 0; i < canais.length; i++) {
                bCanais[i].setEnabled(true);
            }
            bSexoM.setEnabled(false);
            bSexoF.setEnabled(false);
        }
    }

    private class votarCanal implements ActionListener {

        Canal canal;

        public votarCanal(Canal canal) {
            this.canal = canal;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            canal.setTelespec(sexo);
            for (int i = 0; i < canais.length; i++) {
                bCanais[i].setEnabled(false);
            }
            bSexoF.setEnabled(true);
            bSexoM.setEnabled(true);
        }
    }

    private class Resultado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();

            JFrame frame;
            DecimalFormat dc= new DecimalFormat("0.00");
            frame = new JFrame("Resultado");
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JTextArea texto = new JTextArea();
            for (int i = 0; i < canais.length; i++) {
                texto.append(canais[i].getNome() + ": \n");
                texto.append("Total de espectadores: " + canais[i].getAud() + '\n');
                texto.append("Porcentagem feminina de espectadores: " + dc.format(canais[i].percF()) + "%.\n");
                texto.append("Porcentagem masculina de espectadores: " + dc.format(canais[i].percM()) + "%.\n");
                texto.append("-----------\n\n");
            }
            texto.setEditable(false);
            frame.add(texto);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
}
