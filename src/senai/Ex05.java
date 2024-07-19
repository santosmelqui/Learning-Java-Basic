package senai;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o ano atual: ");
        int anoAtual = in.nextInt();
        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = in.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.printf("Com a data de 2024-05-09 você tem atualmente %d anos", idade);
    }
}
