package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1013 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = in.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = in.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = in.nextInt();
        int maiorAB = ((a + b + (a * b)) * (a-b)) / 2;
        System.out.println("É o maior " + maiorAB);

    }
}
