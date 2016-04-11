/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presidente;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Candidato {
    private String Nome;
    private int nVotos;
    private static int Total;

    public Candidato(){
        this.Nome="default";
        this.nVotos=0;
    }
    public Candidato(String Nome, int nVotos) {
        this.Nome = Nome;
        this.nVotos = nVotos;
    }

    public Candidato(String Nome) {
        this.Nome = Nome;
        this.nVotos=0;
    }    
    
    public void Votar(){
        nVotos++;
        Total++;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getnVotos() {
        return nVotos;
    }

    public void setnVotos(int nVotos) {
        this.nVotos = nVotos;
    }
    
    public static int getTotal(){
        return Total;
    }
    
}
