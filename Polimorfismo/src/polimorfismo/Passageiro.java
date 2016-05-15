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
public class Passageiro {
    private int id;
    Passagem p;

    public Passageiro(){
        
    }
    
    public Passageiro(int id, Passagem p) {
        this.id = id;
        this.p = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passagem getP() {
        return p;
    }

    public void setP(Passagem p) {
        this.p = p;
    }
    
    public String toString(){
        return "\nIdentidade: "+id + p.toString();
    }
    
    
}
