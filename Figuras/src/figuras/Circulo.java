/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Circulo extends FiguraGeometrica{
    private double raio;
    public Circulo(){
        
    }
    
    public Circulo(double raio){
        this.raio=raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(raio,2); //PI.R²
    }
    
    public double getPerimetro(){
        return 2*Math.PI*raio;
    }
    
    public double getDiametro(){
        return 2*raio;
    }
}
