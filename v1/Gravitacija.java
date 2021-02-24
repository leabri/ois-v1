/* Gravitacija  */
import java.util.*;
public class Gravitacija {
    public static double pospesek() {
     Scanner sc = new Scanner(System.in);

     double v =sc.nextDouble();

     double C = 6.674 * 0.00000000001;
     double M = 5.972 * 1000000*1000000*1000000*1000000;
     double r = 6.371 * 1000000;

     double a = (C * M) /((r+v)*(r+v));

     return(a);
      }

    public static void main(String[] args){

        System.out.println("OIS je zakon!");
    }
}