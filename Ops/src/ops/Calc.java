/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ops;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Calc extends OpAvancado{
    public double area(int px1,int px2, int px3, int px4, int py1, int py2, int py3, int py4){
        double largura, altura;
        largura = distPonto(px1,px2,py1,py2); // insere coordenadas dos Pontos 1 e 2 para definir largura
        altura = distPonto (px1,px3,py1,py3); // insere coordenadas dos Pontos 1 e 3 para definir altura
        return MultReais(largura,altura);       
    }
}
