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
public class Voo{
    protected int nVoo;
    protected int capacidade;
    
    public Voo(){        
    }
    
    public Voo(int nVoo,int capacidade){
        this.nVoo=nVoo;
        this.capacidade=capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getnVoo() {
        return nVoo;
    }

    public void setnVoo(int nVoo) {
        this.nVoo = nVoo;
    }
    
    public String toString(){
        return "\nNº voo: "+nVoo +"\nCapacidade: "+capacidade;
    }
    
    
}
