package Exercicio02;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        int frequenciaMax;
        double[] frequenciaAlvo;

        System.out.print("Digite seu nome: ");
        paciente.nome = sc.next();
        System.out.print("Digite sua idade: ");
        paciente.idade = sc.nextInt();

        frequenciaMax = paciente.frequenciaMax();
        System.out.println("Frequência cardíaca máxima: " + frequenciaMax);

        frequenciaAlvo = paciente.frequenciaAlvo();
        System.out.println("Alvo inicial: " + df.format(frequenciaAlvo[0]));
        System.out.println("Alvo final: " + df.format(frequenciaAlvo[1]));
    }
}
