public class Calculation {

    public void Gravity(double m1, double m2, double r) {
        if (r != 0) {
            System.out.println((m1 * m2) / Math.pow(r, 2));
        } else {
            System.out.println("Division not defined");
        }
    }

    public static void Quadratic(double a, double b, double c) {
        double x1 = 0;
        double x2 = 0;
        double d;
        d = Math.pow(b, 2) - (4 * a * c);
        if (d == 0) {
            x1 = -b / (2 * c);
            x2 = -b /( 2 * c);
            System.out.println("x:"+x1+ "x2"+x2);
        } else if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x:"+x1+ "x2"+x2);
        } else {
            d = Math.abs(d);
            x1 = (-b + Math.sqrt(d) )/ (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x:"+x1+"x2"+x2);
        }
//       System.out.println(x1,x2};
    }
}