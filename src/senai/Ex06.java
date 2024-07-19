package senai;

import java.util.Scanner;
import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite seu nome para cadastro: ");
        String nome = in.nextLine();
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        int numeroAleatorio = random.nextInt(900) + 100;
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
        in.nextLine();
        System.out.println("Digite seu genero: [M/F}");
        String genero = in.nextLine();
        System.out.println("Digite seu curso: ");
        String curso = in.nextLine();
        String ra = primeiraLetra + String.valueOf(numeroAleatorio);
        System.out.printf("" +
                "Seu nome é %s e ele possui  letras, sua idade é %d, seu gênero é %s, Você se inscreveu no curso de %s, com o RA %s%n", nome, idade, genero, curso, ra);
    }
}
