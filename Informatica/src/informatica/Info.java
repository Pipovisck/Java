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
public class Info implements Produtos{
    protected String marca;
    protected double preco;
    protected int quant;
    
    public Info(){
        
    }
    
    public Info(String marca, double preco, int quant) {
        this.marca = marca;
        this.preco = preco;
        this.quant=quant;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    @Override
    public void venda(){
        quant--;
    }
    
    @Override
    public int estoque(){
        return quant;
    }
    
}
