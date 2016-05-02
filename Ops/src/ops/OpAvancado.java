/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ops;
import java.lang.Math;

/**
 *
 * @author GABRIEL HADDAD
 */
public class OpAvancado extends OpBasico{

    protected int pot(int x, int y){ //Potencia INT
        int pot=0;
        for (int i=0;i<y;i++){
           pot = MultInt(x,x);
        }
        return pot;
    }
    
    protected double pot(double x, int y){ //Potencia DOUBLE
        double pot=0;
        for (int i=0;i<y;i++){
           pot = MultReais(x,x);
        }
        return pot;
    }
    
    protected int fat(int n){  //Fatorial INT
       int fact=1;
       for (int i=1; i<=n; i++){
           fact = MultInt(fact,i);
       }
       return fact;
    }
    
    protected double distPonto(int x1, int x2,int y1,int y2){
        return Math.sqrt(SomaInt(pot(SubInt(x1,x2),2),pot(SubInt(y1,y2),2)));
    }
}
