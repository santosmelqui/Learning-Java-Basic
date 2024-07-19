package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1011 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do reio: ");
        float raio = in.nextFloat();

        double volume = (4.0/3) * 3.14159 * (raio * raio * raio);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
