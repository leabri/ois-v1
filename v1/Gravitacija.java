/* Gravitacija  */

import java.util.*;

public class Gravitacija {
    public static double pospesek(double v) {
        double C = 6.674 * 0.00000000001;
        double M = 5.972 * 1000000*1000000*1000000*1000000;
        double r = 6.371 * 1000000;

        double a = (C * M) /((r+v)*(r+v));
        return(a);
     }

    public static void izpisi(double nadmorskaVisina, double gravitacijskiPospesek){
        System.out.printf("Nadmorska visina: %.3f m%nGravitacijski pospesek: %.3f m/s^2%n", nadmorskaVisina, gravitacijskiPospesek);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double visina = sc.nextDouble();
        izpisi(visina, pospesek(visina));
    }
}