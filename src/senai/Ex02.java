package senai;

import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = in.nextDouble();
        double resultado = Math.pow(raio, 2) * 3.14;
        System.out.println("O resultado é: "+resultado);
    }
}
