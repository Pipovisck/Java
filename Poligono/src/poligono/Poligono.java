/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Poligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        segmento lado1 = new segmento();
        segmento lado2 = new segmento();
        segmento lado3 = new segmento();
        
        lado1.setSeg(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira comprimento","Paralelepipedo",JOptionPane.QUESTION_MESSAGE)));
        lado2.setSeg(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira altura: ","Paralelepipedo",JOptionPane.QUESTION_MESSAGE)));
        // Retangulo com parametros Double
        retangulo ret = new retangulo(lado1, lado2);
        lado3.setSeg(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira profundidade: ","Paralelepipedo",JOptionPane.QUESTION_MESSAGE)));
        // Paralelepipedo com parametros Retangulo e Segmento
        paralelepipedo p = new paralelepipedo(ret,lado3);
        
        //Classe para imprimir mensagens
        Msgs.Msg(p);
    }
    
}
