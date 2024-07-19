package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1003 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número para soma: ");
        int a = in.nextInt();
        System.out.println("Digite o segundo número para soma: ");
        int b = in.nextInt();
        //soma dos valores
        int soma = a + b;
        System.out.printf("soma = %s", soma);
    }
}
