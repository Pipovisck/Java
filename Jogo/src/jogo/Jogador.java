/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Jogador {
    private String nome;
    private int pontos;
    
    public Jogador(String nome){
        this.nome=nome;
        this.pontos=0;
    }
    public Jogador(int pontos){
        this.nome="Ximba";
        this.pontos=pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public void Play(){
        pontos+=Dado.Jogar();
    }
}
