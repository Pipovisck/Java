/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrevista;

/**
 *
 * @author Aluno
 */
public class Entrevista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canal canal[] = new Canal[4];  
        canal[0]=new Canal("CH 2");
        canal[1]=new Canal ("CH 5");
        canal[2]=new Canal ("CH 7");
        canal[3]=new Canal ("CH 9");
        
        Gui gui = new Gui(canal);
    }    
}
