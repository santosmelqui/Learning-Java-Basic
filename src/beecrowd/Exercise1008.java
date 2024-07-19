package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número do funcionário: ");
        int num = in.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = in.nextInt();
        System.out.println("Digite o salário por hora \nR$: ");
        float salarioPorHora = in.nextInt();

        DecimalFormat dfInput = new DecimalFormat("0.00");
        salarioPorHora = Float.parseFloat(dfInput.format(salarioPorHora));

        float salario = horasTrabalhadas * salarioPorHora;

        System.out.printf("NUMBER = %d \n SALARY = R$ %d", num, salario);
    }
}
