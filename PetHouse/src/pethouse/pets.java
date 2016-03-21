/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pethouse;

/**
 *
 * @author aluno
 */
public class pets {
    private int dias=3;
    private String nome;
    private Dog poodle;
    private Dog Vira;
    private Dog Alemao;
    
    //construtor sem parametros
    public pets(){
        Dog poodle=new Dog();
        Dog Vira=new Dog();
        Dog Alemao=new Dog();
    }
    
    //consrutor com paramentros
    public pets(String nome,Dog poodle, Dog Vira, Dog Alemao){
        this.nome=nome;
        this.poodle=poodle;
        this.Vira=Vira;
        this.Alemao=Alemao;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dog getPoodle() {
        return poodle;
    }

    public void setPoodle(Dog poodle) {
        this.poodle = poodle;
    }

    public Dog getVira() {
        return Vira;
    }

    public void setVira(Dog Vira) {
        this.Vira = Vira;
    }

    public Dog getAlemao() {
        return Alemao;
    }

    public void setAlemao(Dog Alemao) {
        this.Alemao = Alemao;
    }
    public double calcRacao(){
       for(int i=0;i<dias;i++){
           poodle.Comer();
           Vira.Comer();
           Alemao.Comer();
       }
       return Dog.getRacao();
    }
  }
  
