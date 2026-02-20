package Exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Digite seu nome: ");
        professor.nome = sc.next();
        System.out.print("Digite o valor da hora-aula: ");
        professor.valorAula = sc.nextDouble();
        System.out.print("Digite número de aulas semanais: ");
        professor.totalAula = sc.nextInt();

        System.out.println("Salário base: R$" + df.format(professor.salarioBase()));
        System.out.println("Adicional de hora-atividade: R$" + df.format(professor.horaAdicional()));
        System.out.println("Descanso Semanal Remunerado: R$" + df.format(professor.descansoSemanal()));
        System.out.println("Salário Bruto: R$" + df.format(professor.salarioBruto()));
    }
}
