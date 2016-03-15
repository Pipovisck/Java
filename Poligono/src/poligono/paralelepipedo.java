/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

/**
 *
 * @author GABRIEL HADDAD
 */
public class paralelepipedo {
    private retangulo retan;
    private segmento l1;
    private segmento l2;
    private segmento lado3;
    public paralelepipedo (double x, double y, double z){
        retan= new retangulo();
        lado3=new segmento();
    }
    public paralelepipedo(retangulo retan, segmento lado3){
        setRetan(retan);
        this.lado3=lado3;
    }

    public retangulo getRetan() {
        return retan;
    }

    public void setRetan(retangulo retan) {
        this.retan = retan;
    }

    public segmento getLado3() {
        return lado3;
    }

    public void setLado3(segmento lado3) {
        this.lado3 = lado3;
    }
    public double AreaExt(){
        double y=retan.area();
        double l3= lado3.getSeg();
        return 4*y+2*l3*retan.getLado2().getSeg();
    }
    public double Volume(){
        double z=retan.area();
        return z*lado3.getSeg();
    }
}
