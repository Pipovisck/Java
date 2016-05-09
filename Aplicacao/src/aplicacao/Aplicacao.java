/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Disciplina d[] = new Disciplina[5];
      for(int j=0; j<d.length;j++){
          d[j]=new Disciplina();
      }
      Professor prof = new Professor();
      d[0] = new Disciplina("LPII",300,prof);
      d[1] = new Disciplina ("WEB");
      d[2] = new Disciplina ("Matematica");
      d[3] = new Disciplina ("Portugues");
      d[4] = new Disciplina("LMC");
      prof.setNome("Zé Wilson");
      prof.setId("MG-9000");
      prof.setMatricula(9999);
      prof.setDis(d[0]);
      Aluno a[] = new Aluno[10];
      for(int i=0; i<a.length; i++){
          a[i]=new Aluno();
          a[i].setId("MG-"+i);
          a[i].setMatricula(0+i);
      }
      a[0].setNome("Jota");
      a[1].setNome("Morato");
      a[2].setNome("Haddad");
      a[3].setNome("Paula");
      a[4].setNome("Bill");
      a[5].setNome("Thalezin");
      a[6].setNome("Jesus");
      a[7].setNome("Brenim");
      a[8].setNome("Terror");
      a[9].setNome("Joao Pedro");
      System.out.println(d[0].getProf());
      JOptionPane.showMessageDialog(null,prof.toString()+"\n"+d[0].toString(),"LP2",JOptionPane.INFORMATION_MESSAGE);
      for(int j=0; j<a.length;j++){
        JOptionPane.showMessageDialog(null,a[j].toString()+"\n"+d[0].getNome()+"\n"+
                d[1].getNome()+"\n"+d[2].getNome()+"\n"+d[3].getNome()+"\n"+
                d[4].getNome(),"LP2",JOptionPane.INFORMATION_MESSAGE);
        }
     
    }  

}
