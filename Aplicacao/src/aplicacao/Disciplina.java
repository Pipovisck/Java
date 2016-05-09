/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

/**
 *
 * @author Aluno
 */
public class Disciplina {
    private String nome;
    private int code;
    private Professor prof;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }
    public String toString(){
        return "Nome Disciplina: "+nome+"\nCodigo: "+code+"\nProfessor: "+prof.getNome();
    }   
    public Disciplina(){
        
    }
    public Disciplina(String nome){
        this.nome=nome;
    }
    
    public Disciplina(String nome, int code, Professor prof){
        this.nome=nome;
        this.code=code;
        this.prof=prof;
    }
}
