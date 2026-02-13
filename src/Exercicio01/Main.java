package Exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instanciar classe scanner
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();
        double saldo;

        System.out.print("Nome do correntista: ");
        conta.correntista = sc.next();

        conta.numero = rd.nextInt(1000, 9999);
        System.out.print("Número da conta: ");
        System.out.println(conta.numero);

        conta.depositar(1000);
        System.out.println( conta.saldo);

        conta.sacar(750);
        System.out.println(conta.saldo);
    }
}
