package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1015 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite X1: ");
        double xOne = in.nextInt();
        System.out.println("Digite X2: ");
        double xTwo = in.nextInt();
        System.out.println("Digite Y1: ");
        double yOne = in.nextInt();
        System.out.println("Digite Y2: ");
        double yTwo = in.nextInt();
        double distancia = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
        System.out.println(distancia);
    }
}
