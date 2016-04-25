/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.text.DecimalFormat;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Figuras extends JFrame {

    public static void main(String[] args) {
        
        DecimalFormat dc = new DecimalFormat("0.00");
        JTextArea texto = new JTextArea();
        JFrame frame = new JFrame("Frame");
        Circulo c = new Circulo();
        Retangulo r= new Retangulo();
        
        c.setRaio(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira raio: ")));
        r.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira altura do retangulo: ")));
        r.setLargura(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira altura do retangulo: ")));
        
        texto.append("DATA/HORA ATUAL: "+r.getData()+"\n\nRETANGULO: \nArea: "+dc.format(r.getArea())+"cm²\nPerimetro: "
                     +r.getPerimetro()+" cm" + "\n\nCIRCULO: \nArea: "+dc.format(c.getArea())
                     +"cm²\nPerimetro: "+dc.format(c.getPerimetro())+" cm");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        texto.setEditable(false);
        frame.add(texto);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
