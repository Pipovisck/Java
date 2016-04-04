/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL HADDAD
 */
public class voo {
    private int nVoo;
    private int tAviao;
    private int preco;
    passageiro passageiro[];
    private int capacidade;
    private int passagens;
    
    public voo(){       //construtor sem parametros      
        
    }
    
    public voo(int nVoo,int tAviao,int preco){      //construtor com parametros
        this.nVoo=nVoo;
        this.tAviao=tAviao;
        this.preco=preco;
        setCapacidade();    //definir a capacidade do tipo do Aviao
    }

    public int getnVoo() {
        return nVoo;
    }

    public void setnVoo(int nVoo) {
        this.nVoo = nVoo;
    }

    public int gettAviao() {
        return tAviao;
    }

    public void settAviao(int tAviao) {
        this.tAviao = tAviao;
        setCapacidade();
        passageiro = new passageiro[capacidade];
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public passageiro getPassageiro() {
        return passageiro[passagens];
    }

    public void setPassageiro(passageiro p) {
        passageiro[passagens] = p;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade() {
        if(gettAviao()==707){
            capacidade=10;
        }
        else{
            if (gettAviao()==727){
                capacidade=7;
            }
            else{
                if(gettAviao()==737){
                    capacidade=5;
                }
                else{
                  JOptionPane.showMessageDialog(null,"ERRO! Tipo de Aviao Inválido!","Erro",JOptionPane.ERROR_MESSAGE);
                  System.exit(1);
                }
            }                
        }
    }
    
    public int getPassagem(){
        return passagens;
    }
    
    public void setPassagem(){
        passagens=0;
    }
    
    public void passagem() {
        passagens++;        
    }
    public boolean CheckLugar(){
        /*if(passagens<capacidade)
            return true;
        else
            return false;*/
        return passagens<capacidade; //sugestao NetBeans- retorna true/false
    }
}
