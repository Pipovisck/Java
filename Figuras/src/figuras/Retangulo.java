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
public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;
    
    public Retangulo(){
        
    }
    
    public Retangulo(double largura,double altura){
        this.largura=largura;
        this.altura=altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getArea(){
        return altura*largura;
    }
    
    public double getPerimetro(){
        return 2*altura+2*largura;
    }
    
    
}
