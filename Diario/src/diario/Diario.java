
package diario;
import java.util.Scanner;
/**
 *
 * @author GABRIEL HADDAD
 */
public class Diario {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        diarios aluno[]=new diarios[2];
        aluno[0]=new diarios();
        aluno[1]=new diarios(60, 60, 100);
        
        System.out.println("Insira Numero de Aulas (max 60): ");
        int x= Integer.parseInt(scanner.nextLine());
        aluno[0].setNaulas(x);
        System.out.println("Insira Numero de Aulas Frequentadas: ");
        int y= Integer.parseInt(scanner.nextLine());
        aluno[0].setAFreq(y);
        System.out.println("Insira Nota: ");
        int z= Integer.parseInt(scanner.nextLine());
        aluno[0].setNota(z);
        for (diarios D : aluno)
          D.PrintData();       
    }
    
}
