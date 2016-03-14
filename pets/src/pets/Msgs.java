/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class Msgs {
    public static void Msg(PetHouse pets){
        double totalCat=pets.gato.getQuantAlDiario()*pets.getEstadCat();
        double totalDog=pets.cao.getQuantAlDiario()*pets.getEstadDog();
        JOptionPane.showMessageDialog(null,"CACHORRO\n "+pets.cao.toString()
                                      +"\nEstadia: "+pets.getEstadDog()
                                      +"\nTotal Comida: "+totalDog
                                      +"\nGATO\n "+pets.gato.toString()
                                      +"\nEstadia: "+pets.getEstadCat()
                                      +"\nTotal Comida: "+totalCat);
    }
}
