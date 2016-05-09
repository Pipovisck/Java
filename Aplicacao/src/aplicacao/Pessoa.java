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
public abstract class Pessoa {
    protected String id;
    protected String nome;

    abstract String getId();
    abstract void setId(String id);
    abstract String getNome();
    abstract void setNome(String nome);
    
    protected Pessoa(){
        
    }
    
    protected Pessoa(String id,String nome){
        this.id=id;
        this.nome=nome;
    }
}
