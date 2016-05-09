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
public class Aluno extends Pessoa{
    private int x;
    private int matricula;    
    Disciplina dis[];
        

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return "\nNome Aluno: "+nome+"\nId: "+id+"\nMatricula: "+matricula+
                "\nMatérias: ";
    }
    
    public Aluno(){
        
    }
    
    public Aluno(String id,String nome,int matricula){
        super(id,nome);
        this.matricula=matricula;
    }
    
}
