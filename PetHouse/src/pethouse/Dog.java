/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pethouse;

/**
 *
 * @author aluno
 */
public class Dog {
    private String nome;
    private String som;
    private double QuantAli;
    private static double Racao;

    public Dog() {
    }

    public Dog(String nome, String som, double QuantAli) {
        this.nome = nome;
        this.som = som;
        this.QuantAli = QuantAli;
    }


    public static double getRacao() {
        return Racao;
    }

    public static void setRacao(double Racao) {
        Dog.Racao = Racao;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public double getQuantAli() {
        return QuantAli;
    }

    public void setQuantAli(double QuantAli) {
        this.QuantAli = QuantAli;
    }
    
    public void Comer(){
        Racao-=this.QuantAli;
    }
    
}
