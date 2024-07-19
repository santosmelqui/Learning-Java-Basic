package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1007 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor A");
        int a = in.nextInt();
        System.out.println("Digite o valor B");
        int b = in.nextInt();
        System.out.println("Digite o valor C");
        int c = in.nextInt();
        System.out.println("Digite o valor D");
        int d = in.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("DIFERENÇA = "+diferenca);

    }

}
