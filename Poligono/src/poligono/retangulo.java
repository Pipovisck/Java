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
public class retangulo {
   private segmento lado1;
   private segmento lado2;
   public retangulo(){
       lado1=new segmento();
       lado2=new segmento();
   }
   public retangulo(segmento lado1, segmento lado2){
       this.lado1=lado1;
       this.lado2=lado2;
   }
   public retangulo(double l1, double l2){
       lado1=new segmento();
       lado2= new segmento();
       lado1.setSeg(l1);
       lado2.setSeg(l2);
   }
   
   public void setLado1(segmento lado1) {
       this.lado1 = lado1;
   }
   
   public void setLado1(double l1){
       lado1.setSeg(l1);
   }
   
   public segmento getLado1() {
       return lado1;
   }
   
   public double getSeg1(){
       return lado1.getSeg();
   }   
   
   public void setLado2(segmento lado2) {
       this.lado2 = lado2;
   }
   
   public void setLado2(double l2){
       lado2.setSeg(l2);
   }
   
   public segmento getLado2() {
       return lado2;
   }

   public double getSeg2(){
       return lado2.getSeg();
   }
   public double area(){
       return lado1.getSeg()*lado2.getSeg();
   }
   public double perimetro(){
       return 2*lado1.getSeg()+2*lado2.getSeg();
   }
}
