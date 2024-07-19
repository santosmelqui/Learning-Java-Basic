package senai;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        String nome = in.nextLine();
        System.out.printf("%s por favor, digite o seu RA: \n" ,nome);
        int ra = in.nextInt();
        System.out.println("\nnota 1: ");
        double n1 = in.nextDouble();
        System.out.println("nota 2: ");
        double n2 = in.nextDouble();
        System.out.println("nota 3: ");
        double n3 = in.nextDouble();
        double media = (n1 + n2 + n3) / 3;

        System.out.printf("Querido aluno %s do RA %s sua média foi igual a %.2f ",nome, ra, media);

    }
}
