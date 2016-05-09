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
public class Professor extends Pessoa{
    private int matricula;
    private Disciplina dis;
    
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

    public Disciplina getDis() {
        return dis;
    }

    public void setDis(Disciplina dis) {
        this.dis = dis;
    }
    
    public Professor(){
        
    }
    
    public Professor(String id,String nome, int matricula, Disciplina dis){
        super(id,nome);
        this.matricula=matricula;
        this.dis=dis;
    }
    
    public String toString(){
        return "Nome prof: " +nome+"\nIdentidade: "+id+"\nMatricula: "+ matricula;                
    }
     
}
