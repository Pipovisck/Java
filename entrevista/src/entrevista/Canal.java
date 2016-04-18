/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrevista;

/**
 *
 * @author Aluno
 */
public class Canal {
    private String nome;
    private int homem;
    private int mulher;
    private int aud;

    public Canal(){
        this.homem=0;
        this.mulher=0;
        this.aud=0;
        this.nome="Default";
    }
    
    public Canal(String nome){
        this.nome=nome;
        this.homem=0;
        this.mulher=0;
        this.aud=0;
    }   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHomem() {
        return homem;
    }

    public void setTelespec(int x){
        if(x==0){
            mulher++;
        }
        else{
            homem++;
        }
        aud++;
    }

    public int getAud() {
        return aud;
    }

    public void setAud(int aud) {
        this.aud = aud;
    }   
    
    public int getMulher() {
        return mulher;
    }

    public void setMulher(int mulher) {
        this.mulher = mulher;
    }
    
    public double percM(){
        return homem /(double) aud*100;
    }

    public double percF(){
        return mulher /(double) aud*100;
    }

}
