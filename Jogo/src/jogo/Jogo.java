/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         Jogador P1 = new Jogador("Haddad");
         Jogador P2 = new Jogador("Zé Wilson");
         Jogador P3 = new Jogador("Geraldo");
         Jogador P4 = new Jogador("Alfredo");
         Jogador winner = new Jogador(-100);
         
         Random rand = new Random();
         JOptionPane.showMessageDialog(null,"Bem Vindo ao Dado Simulator!");
         
         //Simular 10 Rodadas
         for(int i=0; i<10; i++){
             int player=rand.nextInt(4);
             switch( player ){
                 case 0: P1.Play(); break;
                 case 1: P2.Play(); break;
                 case 2: P3.Play(); break;
                 case 3: P4.Play(); break;
             }
         }
         
         //Verificar Vencedor
         if(P1.getPontos()> winner.getPontos())
             winner=P1;
         if (P2.getPontos()> winner.getPontos())
             winner=P2;
         if (P3.getPontos() > winner.getPontos())
             winner=P3;
         if (P4.getPontos() > winner.getPontos())
             winner=P4;
         JOptionPane.showMessageDialog(null,"Vencedor: "+winner.getNome()
                                            +"\nPontos: "+winner.getPontos(),
                                    "Vencedor",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
