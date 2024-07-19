package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1006 {
    public static void main(String[] args){
        Locale.setDefault(new Locale("en","US"));
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        float a = in.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float b = in.nextFloat();
        System.out.print("Digite a terceira nota do aluno: ");
        float c = in.nextFloat();
        // Calculando a média ponderada
        float media = (a * 2 + b * 3 + c * 5) / 10;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("A média é igual a " + df.format(media));
    }
}
