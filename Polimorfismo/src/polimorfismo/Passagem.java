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
    protected int code;
    protected int preco;

    public Passagem(int code, int preco, int nVoo, int capacidade) {
        super(nVoo, capacidade);
        this.code = code;
        this.preco = preco;
    }
    
    public Passagem(){
        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    public String toString(){
        return super.toString()+"\nCodigo: "+ code + "\nPreco: "+ preco;
    }
    
           
}
