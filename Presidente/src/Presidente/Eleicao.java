/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presidente;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Eleicao {

    private Candidato[] candidatos;
    private Candidato[] turno2;
    private Candidato winner;

    public Eleicao() {
        candidatos = new Candidato[4];
    }

    public Eleicao(Candidato[] candidatos) {
        this.candidatos = candidatos;
        Gui gui = new Gui(this);
    }

    public void CalcResult() {
        for (int i = 0; i < candidatos.length; i++) {
            if (candidatos[i].getnVotos() > (Candidato.getTotal() - candidatos[i].getnVotos())) {
                winner = candidatos[i];
            }
        }
        if (winner == null) {

            turno2 = new Candidato[2];
            for (int i = 0; i < 2; i++) {
                turno2[i] = new Candidato();
            }
            for (int j = 0; j < candidatos.length; j++) {
                if (candidatos[j].getnVotos() > turno2[0].getnVotos()) {
                    turno2[0] = candidatos[j];
                } else if (candidatos[j].getnVotos() > turno2[1].getnVotos()) {
                    turno2[1] = candidatos[j];
                }
            }

        }
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public Candidato[] getTurno2() {
        return turno2;
    }

    public Candidato getWinner() {
        return winner;
    }

}
