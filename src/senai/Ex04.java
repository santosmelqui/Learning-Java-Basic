package senai;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double porDia = 86.75;
        double porKm = 1.23;
        System.out.println("Quantos dias você ficou com o carro? ");
        int dias = in.nextInt();
        System.out.println("Quantos km você rodou com o carro? ");
        double km = in.nextDouble();
        double valor = (dias * porDia) + (km * porKm);
        System.out.printf("O dia é cobrado %.2f \nCada km é cobrado %.2f \nO valor a ser pago é? R$%.2f", porDia, porKm, valor);
    }
}
