/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presidente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Botao extends JButton{
    public Botao(Candidato candidato){
        super(candidato.getNome());
        addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           candidato.Votar();
           System.out.println("VOTO CONFIRMADO! " + candidato.getNome());
            }
        });
    }
}
