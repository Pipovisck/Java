/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diario;

/**
 *
 * @author GABRIEL HADDAD
 */
class diarios {
    private int nota, nAulas, aulasfreq;
    private double frequencia;
    private String conceito;
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
    public void setFreq(){
        frequencia=(aulasfreq/60.0)*100.0;
    }

    public void CondFinal(){
        if(frequencia<=75){
            printReprov();
        }
        else
            CondNota();
    }
   public void printReprov(){
       System.out.println("Aluno Reprovado !");
   }
   public void printAprov(){
       System.out.println("Aluno Aprovado!");
   }
   public void CondNota(){
       if (nota>=60)
           printAprov();
       else
           printReprov();
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
   public void PrintConceito(){
       System.out.println("Conceito : "+conceito);
   }
   public void PrintData(){
       setFreq();
       System.out.println("----------------------------");
       System.out.println("Num de Aulas: "+nAulas);
       System.out.println("Frequencia: "+frequencia+" %");
       CondFinal();
       incrementaConceito();
       PrintConceito();       
   }
   public diarios(){ //construtor vazio
       
   }
   public diarios(int AF,int NA, int Nota){ //construtor c/ parametros
       aulasfreq=AF;
       nAulas=NA;
       nota=Nota;
   }
}
