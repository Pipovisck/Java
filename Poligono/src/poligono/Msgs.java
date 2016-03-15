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
public class Msgs {
    public static void Msg(paralelepipedo p){
        JOptionPane.showMessageDialog(null,"Volume do Paralelepipedo: "+p.Volume()
         +"\nÁrea Externa: "+p.AreaExt(),"Dados",JOptionPane.INFORMATION_MESSAGE);
    }
}
