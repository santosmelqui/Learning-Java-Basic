package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bonus = 0.15;
        System.out.println("Informe o seu nome: ");
        String nome = in.nextLine();
        System.out.println("Qual o seu salário fixo? ");
        double salario = in.nextDouble();
        System.out.println("Qual o valor das suas vendas neste mês? ");
        double vendas = in.nextDouble();
        double total = (vendas * bonus) + salario;
        System.out.printf(" %s TOTAL = R$ %.2f\n", nome, total);

    }
}
