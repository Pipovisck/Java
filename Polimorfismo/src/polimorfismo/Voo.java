/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author GABRIEL HADDAD
 */
public abstract class Voo{
    protected int nVoo;
    protected String tipo;
    
    
    public Voo(){        
    }
    
    public Voo(int nVoo,String tipo){
        this.nVoo=nVoo;
        this.tipo=tipo;
    }

    public abstract int getnVoo();

    public abstract void setnVoo(int nVoo);

    public String getTipo(){
        return tipo;
    }

    public  void setTipo(String tipo){
        this.tipo=tipo;
    }
   
    public String toString(){
        return "\nNº voo: "+nVoo + "\nTipo vôo: " + tipo;
    }
    
    
}
