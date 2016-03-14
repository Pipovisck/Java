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
public class Pets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dog poodle=new dog();
        
        
        poodle.setNome(JOptionPane.showInputDialog(null,"Insira nome do cachorro: ","Cachorro",JOptionPane.QUESTION_MESSAGE));
        poodle.setQuantAlDiario(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira Quantidade de Alimento do cachorro: ","Cachorro",JOptionPane.QUESTION_MESSAGE)));
        poodle.setSom(JOptionPane.showInputDialog(null,"Insira som do cachorro: ","Cachorro",JOptionPane.QUESTION_MESSAGE));
        
        cat siames=new cat();
        siames.setNome(JOptionPane.showInputDialog(null,"Insira nome do gato: ","Gato",JOptionPane.QUESTION_MESSAGE));
        siames.setQuantAlDiario(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira Quantidade de Alimento do gato: ","Gato",JOptionPane.QUESTION_MESSAGE)));
        siames.setSom(JOptionPane.showInputDialog(null,"Insira som do gato: ","Gato",JOptionPane.QUESTION_MESSAGE));
        
        PetHouse petss=new PetHouse(poodle,siames,"CaeseGatos",5,10);
        Msgs.Msg(petss);
    }
}
