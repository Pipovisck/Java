/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presidencia;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Prefeitura{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Candidato[] candidatos = new Candidato[4];
        String[] nomes = {"Lulalele", "Cirogrude", "Criancinha", "Roseacai"};
        for (int i=0; i<candidatos.length;i++){
            candidatos[i]= new Candidato(nomes[i]);
        }
        
        Eleicao presidencial = new Eleicao(candidatos);
    }
    
}
