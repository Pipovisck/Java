/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GABRIEL HADDAD
 */
public class FiguraGeometrica {
    protected String cor;
    protected boolean preenche;
    //protected java.util.Date dataCriacao;
    Date dataCriacao = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");   
    
    public FiguraGeometrica(){
        
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean estaPreenche() {
        return preenche;
    }

    public void setPreenche(boolean preenche) {
        this.preenche = preenche;
    }

    public java.util.Date getData(){
        dataCriacao.toString();
        return dataCriacao;
    }

    @Override
    public String toString() {
        return ", Data Criacao= " +
                "FiguraGeometrica{" + "Cor= " + cor + ", Preenche= " 
                + preenche + dataCriacao + '}';
    }   
    
}
