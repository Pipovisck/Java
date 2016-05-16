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
public class Passagem extends Voo{
    private double preco;
    private int id;    

    public Passagem(double preco, int nVoo, String tipo, int id) {
        super(nVoo, tipo);
        this.preco = preco;
        this.id = id;
    }
    
    public Passagem(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getnVoo() {
        return nVoo;
    }

    public void setnVoo(int nVoo) {
        this.nVoo = nVoo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }    
    
    public String toString(){
        return super.toString()+ "\nPreco: "+ preco + "\nIdentidade: "+id;
    }
    
           
}
