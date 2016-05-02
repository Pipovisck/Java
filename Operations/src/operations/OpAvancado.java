/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;
/**
 *
 * @author GABRIEL HADDAD
 */
public class OpAvancado extends OpBasico{

    protected double Pot(double x){
        return MultReais(x,x);
    }
    
    protected int Fat(int n){
       int fact=1;
       for (int i=1; i<=n; i++){
           fact = MultInt(fact,i);
       }
       return fact;
    }
    
    protected double DistPonto(double x1, double x2,double y1,double y2){
        return Math.sqrt(SomaReais(Pot(SubReais(x1,x2)),Pot(SubReais(y1,y2))));
    }
}
