/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatica;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Impressora extends Info{
    private String tipo; // laser , jato
    
    public Impressora(){
        
    }
    
    public Impressora(String marca, int quant, double preco, String tipo){
        super(marca,preco,quant);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }       

    @Override
    public String toString() {
        return "Impressora:" + "\nMarca: " + marca + "\nQuantidade: " + quant + 
                "\nPreço: " + preco + "\nTipo: " + tipo;
    }    
    
}
