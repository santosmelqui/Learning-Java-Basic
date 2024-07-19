package senai;

import java.util.Scanner;

public class Ex03 {
        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int a = in.nextInt();
            System.out.println("Quanto quer subtrair? ");
            int b = in.nextInt();
            int resultado = a - b;
            System.out.println("O resultado é: "+resultado);
        }
    }

