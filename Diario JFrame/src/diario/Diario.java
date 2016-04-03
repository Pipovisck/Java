
package diario;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author GABRIEL HADDAD
 */
public class Diario {


    public static void main(String[] args) {
        String resp="s";
        diarios aluno1=new diarios();
       // diarios aluno2=new diarios(60, 60, 100);
        JTextArea CaixaSaida = new JTextArea(11,20);
        JFrame frame= new JFrame();
        CaixaSaida.append("\t\tALUNO\n\nNota\tNumero Aulas\tAulas Freq\tFrequencia\tConceito\tCond Final\n\n");
        while(resp.equals("s")||resp.equals("S")){
        aluno1.setNaulas(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Numero de Aulas (max 60): ")));
        aluno1.setAFreq(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Numero de Aulas Frequentadas: ")));
        aluno1.setNota(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Nota: ")));
        CaixaSaida.append(aluno1.toString());
        resp=JOptionPane.showInputDialog(null,"Deseja continuar? (s/n)");        
        }
        CaixaSaida.setEditable(false);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//        frame.setSize( 700, 200 ); // configura o tamanho do frame
        frame.setLocation(250,250); // posiciona janela na posição (250,250)
        frame.add(CaixaSaida);  //Adiciona o TextArea ao Frame
        frame.pack(); //define o tamanho do frame de acordo com o necessario
        frame.setVisible( true ); // exibe o frame
        //aluno1.PrintData();       
        //aluno2.PrintData();
        //JOptionPane.showMessageDialog(null,CaixaSaida,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
