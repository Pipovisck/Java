/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ops;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calc ret = new Calc();
        String x1,x2,x3,x4,y1,y2,y3,y4;
        JOptionPane.showMessageDialog(null,"5! = "+ret.fat(5),"Fatorial",JOptionPane.INFORMATION_MESSAGE);
        x1= JOptionPane.showInputDialog(null,"Ponto 1\nInsira X : ","Ponto 1",JOptionPane.QUESTION_MESSAGE);
        y1= JOptionPane.showInputDialog(null,"Ponto 1\nInsira Y : ","Ponto 1",JOptionPane.QUESTION_MESSAGE);
        x2= JOptionPane.showInputDialog(null,"Ponto 2\nInsira X : ","Ponto 2",JOptionPane.QUESTION_MESSAGE);
        y2= JOptionPane.showInputDialog(null,"Ponto 2\nInsira Y : ","Ponto 2",JOptionPane.QUESTION_MESSAGE);
        x3= JOptionPane.showInputDialog(null,"Ponto 3\nInsira X : ","Ponto 3",JOptionPane.QUESTION_MESSAGE);
        y3= JOptionPane.showInputDialog(null,"Ponto 3\nInsira Y : ","Ponto 3",JOptionPane.QUESTION_MESSAGE);
        x4= JOptionPane.showInputDialog(null,"Ponto 4\nInsira X : ","Ponto 4",JOptionPane.QUESTION_MESSAGE);
        y4= JOptionPane.showInputDialog(null,"Ponto 4\nInsira Y : ","Ponto 4",JOptionPane.QUESTION_MESSAGE);
        
        double aux = ret.area(Integer.parseInt(x1),Integer.parseInt(x2),Integer.parseInt(x3)
                            ,Integer.parseInt(x4),Integer.parseInt(y1),
                            Integer.parseInt(y2),Integer.parseInt(y3),Integer.parseInt(y4));
        JOptionPane.showMessageDialog(null,"Area é: "+aux,"Area",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
