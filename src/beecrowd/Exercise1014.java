package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1014 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a distância percorrida? ");
        int km = in.nextInt();
        System.out.println("Quantos litros de combustível foram gastos: ");
        double litros = in.nextDouble();

        double consumoMedio = km / litros;

        System.out.printf("%.3f", consumoMedio);

    }
}
