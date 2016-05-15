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
      Passageiro p[] = new Passageiro[5];
      Passagem pas = new Passagem(666,1000,777,50);
      for (int j=0; j<p.length; j++){
          p[j]=new Passageiro();
          p[j].setId(j);
          p[j].setP(pas);
          JOptionPane.showMessageDialog(null,p[j].toString(),"Passagem",JOptionPane.INFORMATION_MESSAGE);
      }
      
      
    }
    
}
