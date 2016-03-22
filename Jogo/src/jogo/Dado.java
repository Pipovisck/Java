/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import java.util.Random;
/**
 *
 * @author GABRIEL HADDAD
 */
public class Dado {
    private static int Faces;
    private static int v;
    
    public static int Jogar(){
        
        Random rand = new Random();
        int x=rand.nextInt(6);
        switch(x){
            case 0: v=0; break;
            case 1: v=1; break;
            case 2: v=-2; break;
            case 3: v=3; break;
            case 4: v=4; break;
            case 5: v=-5; break;            
        }
        return v;
    }
}