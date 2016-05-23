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
public class Computador extends Info implements Produtos {
    private String memoria;
    
    public Computador(){
        
    }
    
    public Computador(String marca, int quant, double preco, String memoria){
        super(marca,preco,quant);
        this.memoria=memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Computador:" + "\nMarca: " + marca + "\nQuantidade: " + quant + 
                "\nPreço: " + preco + "\nMemória: " + memoria;
    } 
    
}
