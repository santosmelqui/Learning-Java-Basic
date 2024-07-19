package exercicios.beecrowd;

import java.util.Scanner;

public class Exercise1002 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a medida do raio: ");
        double raio = in.nextInt();
        double area = 3.14159 * (raio * raio);
        System.out.printf("A área da circunferência é %s ",area);
    }
}
