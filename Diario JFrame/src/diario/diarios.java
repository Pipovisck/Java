/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diario;
import java.text.DecimalFormat;
/**
 *
 * @author GABRIEL HADDAD
 */
class diarios {
    private int nota, nAulas, aulasfreq;
    private double frequencia;
    private String conceito;
    private String condicao;
    DecimalFormat dc= new DecimalFormat("0.00");
    public void setNota(int n){
        nota=n;
    }
    public int getNota(){
        return nota;
    }
    public void setNaulas(int na){
        nAulas=na;
    }
    public int getNaulas(){
        return nAulas;
    }
    public void setAFreq(int afreq){
        aulasfreq=afreq;     
    }
    public int getAFreq(){
        return aulasfreq;
    }
    public double setFreq(){
        frequencia=(aulasfreq/60.0)*100.0;
        return frequencia;
    }

    public String getConceito() {
        return conceito;
    }

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }   

    public String CondFinal(){
        if(frequencia<75){
            return "Reprovado";
        }
        else
           if (nota>=60)
             return "Aprovado";
           else
             return "Reprovado";
    }
   public void printReprov(){
       System.out.println("Aluno Reprovado !");
   }
   public void printAprov(){
       System.out.println("Aluno Aprovado!");
   }
   public void incrementaConceito(){      
      switch ( nota / 10 ){
         case 9:  // nota estava entre 90
         case 10: // e 100
            conceito="A";
            break; 

         case 8: // nota estava entre 80 e 89
            conceito="B";
            break; 
         case 7: // nota estava entre 70 e 79
            conceito="C";
            break; 

         case 6: // nota estava entre 60 e 69
            conceito="D";
            break;

         default: // nota era menor que 60
            conceito="E";
            break;
      } 
   } 
   public String PrintConceito(){
       incrementaConceito();
       return conceito;
   }
  /* public void PrintData(){
       setFreq();
       System.out.println("----------------------------");
       System.out.println("Num de Aulas: "+nAulas);
       System.out.println("Frequencia: "+frequencia+" %");     
   }*/
   public diarios(){ //construtor vazio
       
   }
   public diarios(int AF,int NA, int Nota){ //construtor c/ parametros
       aulasfreq=AF;
       nAulas=NA;
       nota=Nota;
   }

    @Override
    public String toString() {
        return  nota + " \t" + nAulas +"\t " + aulasfreq + 
                "\t" + dc.format(setFreq())+"%"+
                " \t" +PrintConceito()+" \t"+CondFinal()+"\n";
    }
}
