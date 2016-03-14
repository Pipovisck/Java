/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

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
        poodle.setNome("Geraldao");
        poodle.setQuantAlDiario(150);
        poodle.setSom("Au Au");
        
        cat siames=new cat();
        siames.setNome("Garfield");
        siames.setQuantAlDiario(200);
        siames.setSom("Meow!");
        
        PetHouse petss=new PetHouse(poodle,siames,"CaeseGatos",5,10);
        Msgs.Msg(petss);
    }
}
