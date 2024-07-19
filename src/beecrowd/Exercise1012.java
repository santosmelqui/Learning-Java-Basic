package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1012 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o valor de A: ");
        double a = in.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = in.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = in.nextDouble();
        double triRetangulo = (a * c) / 2; //o primeiro valor está errado no beecrowd
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.printf("TRIANGULO: %f\nCIRCULO: %f\nTRAPEZIO: %f\nQUADRADO: %f\nRETANGULO: %f\n",triRetangulo, circulo, trapezio, quadrado, retangulo);
    }
}
