
package operations;

/**
 *
 * @author GABRIEL HADDAD
 */
public class Calc extends OpAvancado{
    
    
    public double Area(double xa1, double xa2, double ya1, double ya2, double xb1, double xb2, double yb1, double yb2){
        double area;
        area = MultReais(DistPonto(xa1,xa2,ya1,ya2),DistPonto(xb1,xb2,yb1,yb2));
        return area;
    }
    

}

