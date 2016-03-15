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
public class segmento {
    private double seg;
    public segmento(){
        
    }
    public segmento (double seg){
        setSeg(seg);
    }
    public void setSeg(double seg){
        if (seg>0){
            this.seg=seg;
        }
        else{
            JOptionPane.showMessageDialog(null,"ERRO!\n\tValor Inválido!","Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    public double getSeg(){
        return seg;
    }
    public String toString(){
        return "Segmento de reta: "+seg;
    }
}
