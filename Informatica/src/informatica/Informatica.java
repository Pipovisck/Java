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
        int x=0, vendidos=0;
        Produtos pro[] = new Produtos[3];
        Celular cel = new Celular ("Apple",2,2000,"Iphone 5");        
        pro[0]= cel;
        Impressora imp = new Impressora ("HP", 100, 500,"Laser");
        pro[1]= imp;
        Computador pc = new Computador ("Dell",500,3000,"16GB");
        pro[2]=pc; //polimorfismo
       
        for(int i=0; i<pro.length; i++){
            JOptionPane.showMessageDialog(null,pro[i].toString()+"\n");
        }
        
        while(x==0){
            int y=Integer.parseInt(JOptionPane.showInputDialog(null,"O que deseja vender ?"
                   + "\n1-Celular"
                   +"\n2- Impressora"
                   + "\n3-Computador"
                   + "\n4-Encerrar vendas")); // máquina do capitalismoooo
            
            switch(y){
                case 1:
                    if(pro[0].estoque()>0){ //checar se possui estoque para vender
                        pro[0].venda();
                        vendidos++;
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Estamos sem estoque :( ");
                    break;
                case 2:
                    if(pro[1].estoque()>0){
                      pro[1].venda();
                        vendidos++;
                    }
                     else
                        JOptionPane.showMessageDialog(null, "Estamos sem estoque :( ");
                    break;
                case 3:
                    if(pro[2].estoque()>0){
                       pro[2].venda();
                       vendidos++;
                    }
                     else
                        JOptionPane.showMessageDialog(null, "Estamos sem estoque :( ");
                    break;
                case 4:
                    x=1;
                    break;                
            }
        }
        
       for (int j=0; j<pro.length; j++) {
            JOptionPane.showMessageDialog(null,pro[j].getClass()+ "\nEm Estoque:" + pro[j].estoque());
        }
       JOptionPane.showMessageDialog(null,"Total de Vendas: "+vendidos,"Produtos Vendidos",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
