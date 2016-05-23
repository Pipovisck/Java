/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatica;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Informatica {

    public static void main(String[] args) {
        Info inf[] = new Info[3];
        String marca;
        int quant;
        double preco;
        String aux;
        
        //definindo celulares
        
        marca= JOptionPane.showInputDialog(null,"Insira marca do celular: ");
        quant= Integer.parseInt(JOptionPane.showInputDialog(null,"Insira quantidade de celulares em estoque: "));
        preco= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira preço do celular:"));
        aux = JOptionPane.showInputDialog(null,"Insira modelo do Celular: ");
        inf[0]= new Celular(marca, quant, preco, aux);
        
        //definindo Impressoras
        
        marca= JOptionPane.showInputDialog(null,"Insira marca da imnpressora: ");
        quant= Integer.parseInt(JOptionPane.showInputDialog(null,"Insira quantidade de impressoras em estoque: "));
        preco= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira preço da impressora:"));
        aux = JOptionPane.showInputDialog(null,"Insira tipo da impressora: ");
        inf[1]= new Celular(marca,quant,preco,aux);
        
        //definindo Computadores

        marca= JOptionPane.showInputDialog(null,"Insira marca do computador: ");
        quant= Integer.parseInt(JOptionPane.showInputDialog(null,"Insira quantidade de computadores em estoque: "));
        preco= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira preço do computador:"));
        aux = JOptionPane.showInputDialog(null,"Insira memória do Computador: ");
        inf[2]= new Computador(marca,quant,preco,aux);
       
        for(int i=0; i<inf.length; i++){
            JOptionPane.showMessageDialog(null,inf[i].toString()+"\n");
        }
        
        for (Info inf1 : inf) {
            JOptionPane.showMessageDialog(null,"Vendendo um produto de "+ inf1.getClass()+ "\nEm Estoque:" + inf1.estoque());
            inf1.venda();
            JOptionPane.showMessageDialog(null, "Em Estoque:" + inf1.estoque());
        }
    }
    
}
