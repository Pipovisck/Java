/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author aluno
 */
public class dog {
    private String nome, som;
    private double QuantAlDiario;

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

    public double getQuantAlDiario() {
        return QuantAlDiario;
    }

    public void setQuantAlDiario(double QuantAlDiario) {
        this.QuantAlDiario = QuantAlDiario;
    }
    public String toString(){
        return "\tNome: "+nome+"\n\tSom: "+som+"\n\tQuantidade Alimento Diario: "+QuantAlDiario;
    }
       
}
