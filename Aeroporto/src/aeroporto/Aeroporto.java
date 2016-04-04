
package aeroporto;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
/**
 *
 * @author GABRIEL HADDAD
 */
public class Aeroporto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nVoos=6; 
        
        passageiro p = new passageiro();
        voo voo[]= new voo[nVoos];
        JTextArea CaixaSaida = new JTextArea(11,20);
        JFrame frame=new JFrame();
        JPanel panel= new JPanel();
        
        CaixaSaida.append("Identidade\tNº do Voo\tPreço\tSituaçao\n");
        for(int i=0;i<nVoos;i++){  //gera os 5 vôos 
            voo[i]=new voo();
            voo[i].setnVoo(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira nº do voo: ","Vôo["+i+"]",JOptionPane.QUESTION_MESSAGE)));
            voo[i].settAviao(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira tipo do aviao: ","Vôo["+i+"]",JOptionPane.QUESTION_MESSAGE)));
            voo[i].setPreco(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira preço do voo: ","Vôo["+i+"]",JOptionPane.QUESTION_MESSAGE)));
        }
        p.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Id do passageiro: ")));
        while(p.getId()!=0){
            p.setVoo(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o voo desejado: ")));
            for (int j=0;j<nVoos;j++){ //le os vôos 
                if(voo[j].getnVoo()==p.getVoo()){  //compara o nº do vôo com o vôo desejado
                    if(voo[j].CheckLugar()){  //verifica a disponibilidade de lugar ( Boolean ) 
                        voo[j].setPassageiro(p); //envia os dados para classe Voo e dps classe passageiro
                       /* JOptionPane.showMessageDialog(null,"Id: "+p.getId()+
                                                    "\nNº do Voo: "+p.getVoo()+
                                                    "\nPreço: "+ voo[j].getPreco()+
                                                    "\nRESERVA CONFIRMADA","Nota Fiscal",JOptionPane.INFORMATION_MESSAGE);*/
                        CaixaSaida.append(p.getId()+"\t"+p.getVoo()+"\tR$"+
                                                    voo[j].getPreco()+
                                                    "\tRESERVA CONFIRMADA  \n");
                        voo[j].passagem(); //add 1 passagem comprada
                    }
                    else{
                       /* JOptionPane.showMessageDialog(null,"Id: "+p.getId()+
                                                     "\nNº do Voo: "+p.getVoo()+
                                                     "\nVÔO LOTADO","Nota Fiscal",JOptionPane.ERROR_MESSAGE);*/
                        CaixaSaida.append(p.getId()+"\t"+p.getVoo()+"\tR$"+
                                                    voo[j].getPreco()+
                                                    "\tVÕO LOTADO  \n");                            
                    }
                }
               // JOptionPane.showMessageDialog(null,"Nº de Voo não encontrado");
               
            }
        p.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Id do passageiro: ")));    
        }  //fecha while
        
        CaixaSaida.setEditable(false);
        panel.add(CaixaSaida);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(250,250);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }    
}
