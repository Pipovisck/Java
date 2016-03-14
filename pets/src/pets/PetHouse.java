/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author aluno
 */
public class PetHouse {
    private String NomeLoja;
    private int EstadCat, EstadDog;
    dog cao;
    cat gato;

    public PetHouse() {
       dog Cao =new dog();
       cat Gato =new cat();
    }
    
    
    public PetHouse(dog cao,cat gato,String NomeLoja, int EstadDog,int EstadCat){
        this.gato=gato;
        this.cao=cao;
        this.NomeLoja=NomeLoja;
        this.EstadDog=EstadDog;
        this.EstadCat=EstadCat;
    }

    public int getEstadCat() {
        return EstadCat;
    }

    public void setEstadCat(int EstadCat) {
        this.EstadCat = EstadCat;
    }

    public int getEstadDog() {
        return EstadDog;
    }

    public void setEstadDog(int EstadDog) {
        this.EstadDog = EstadDog;
    }

    public String getNomeLoja() {
        return NomeLoja;
    }

    public void setNomeLoja(String NomeLoja) {
        this.NomeLoja = NomeLoja;
    }


    public dog getCao() {
        return cao;
    }

    public void setCao(dog cao) {
        this.cao = cao;
    }

    public cat getGato() {
        return gato;
    }

    public void setGato(cat gato) {
        this.gato = gato;
    }
}