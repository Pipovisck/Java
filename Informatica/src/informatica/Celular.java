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
public class Celular extends Info implements Produtos{
    private String modelo;
    
    public Celular(){
        
    }
    
    public Celular(String marca, int quant,double preco, String modelo){
        super(marca,preco,quant);
        this.modelo=modelo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Celular:" + "\nMarca: " + marca + "\nQuantidade: " + quant + 
                "\nPreço: " + preco + "\nModelo: " + modelo;
    }
    
}
