/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pethouse;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author aluno
 */
public class PetHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog poodle=new Dog();
        poodle.setNome(JOptionPane.showInputDialog(null,"Insira nome do Poodle:","Poodle",JOptionPane.QUESTION_MESSAGE));
        poodle.setQuantAli(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira Quantidade de Alimento do Poodle: ","Poodle",JOptionPane.QUESTION_MESSAGE)));
        poodle.setSom(JOptionPane.showInputDialog(null,"Insira som do Poodle: ","Poodle",JOptionPane.QUESTION_MESSAGE));
        
        Dog Vira=new Dog();
        Vira.setNome(JOptionPane.showInputDialog(null,"Insira nome do Vira-Lata:","Vira-Lata",JOptionPane.QUESTION_MESSAGE));
        Vira.setQuantAli(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira Quantidade de Alimento do Vira-Lata: ","Vira-Lata",JOptionPane.QUESTION_MESSAGE)));
        Vira.setSom(JOptionPane.showInputDialog(null,"Insira som do Vira-Lata: ","Vira-Lata",JOptionPane.QUESTION_MESSAGE));
        
        Dog Alemao=new Dog();
        Alemao.setNome(JOptionPane.showInputDialog(null,"Insira nome do Pastor Alemao:","Pastor Alemao",JOptionPane.QUESTION_MESSAGE));
        Alemao.setQuantAli(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira Quantidade de Alimento do Pastor Alemao: ","Pastor Alemao",JOptionPane.QUESTION_MESSAGE)));
        Alemao.setSom(JOptionPane.showInputDialog(null,"Insira som do Pastor Alemao: ","Pastor Alemao",JOptionPane.QUESTION_MESSAGE));
        
        pets PetHouse=new pets("Caes e Cia",poodle,Vira,Alemao);
        Dog.setRacao(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a Quantidade de Racao Total:","Racao",JOptionPane.QUESTION_MESSAGE)));
        DecimalFormat df = new DecimalFormat("#.###");
        JOptionPane.showMessageDialog(null,"Raçao restante na "+PetHouse.getNome()+" : "+df.format(PetHouse.PassarDias())+"kg","Racao",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
