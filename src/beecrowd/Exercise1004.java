package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1004 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = in.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = in.nextInt();
        int prod = a * b;
        System.out.printf("PROD = %s \n", prod);
    }
}
