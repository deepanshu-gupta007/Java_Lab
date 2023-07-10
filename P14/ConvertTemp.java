abstract class Temperature {
    protected double temp;
    void setTempData(double tmp) {
        temp=tmp;
    }
    abstract void changeTemp();
}
class Fahrenheit extends Temperature {
    double ctemp;
    void changeTemp() {
        ctemp=5.0/9.0*(temp-32.0);
        System.out.println("Fahrenheit into Degree Celsius = "+ctemp);
    }
}
class Celsius extends Temperature {
    double ftemp;
    void changeTemp() {
        ftemp=(9.0/5.0)*temp+32.0 ;
        System.out.println("Degree Celsius into Fahrenheit = "+ftemp);
    }
}
public class ConvertTemp {
    public static void main(String [] args) {
        Temperature ref;
        Fahrenheit fr=new Fahrenheit(); 
        fr.setTempData(108);
        Celsius cr=new Celsius(); 
        cr.setTempData(50); 
        ref=fr;
        ref.changeTemp(); 
        ref=cr; 
        ref.changeTemp();
    }
}
