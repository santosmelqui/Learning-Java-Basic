package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1005 {
    public static void main(String[] args){
        Locale.setDefault(new Locale("en","US"));
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double a = in.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double b = in.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;
        double media = (a * pesoA + pesoB * b) / (pesoA + pesoB);
        System.out.printf("A média é igual a %.5f%n \n", media);
    }
}
