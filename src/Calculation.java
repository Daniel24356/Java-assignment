public class Calculation {

    public void Gravity(double m1, double m2,double r){
    if(r !=0){
        System.out.println( (m1 * m2)/ Math.pow(r,2));
        }
    else {
        System.out.println("Division not defined");
    }
    }
}
