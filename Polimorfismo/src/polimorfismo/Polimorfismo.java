/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Polimorfismo {

    public static void main(String[] args) {
      Voo voo[] = new Voo[3];
      int nVoo;
      String tipo;
      double preco;
      int id;
      for(int i=0; i<voo.length; i++){
          nVoo= Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o nº do voo: ","Voo "+i,JOptionPane.QUESTION_MESSAGE));
          tipo = JOptionPane.showInputDialog(null,"Insira o tipo do voo","Voo "+i,JOptionPane.QUESTION_MESSAGE);
          preco = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira preço da passagem: ","Voo "+i,JOptionPane.QUESTION_MESSAGE));
          id = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Identidade: ","Passageiro",JOptionPane.QUESTION_MESSAGE));
          voo[i]= new Passagem(preco,nVoo,tipo,id);
      }
        for (Voo voo1 : voo) {
            JOptionPane.showMessageDialog(null, voo1.toString(), "Passagem", JOptionPane.INFORMATION_MESSAGE);
        } 
    }
    
}
