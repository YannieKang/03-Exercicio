package Exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instanciar classe scanner
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();
        Conta conta2 = new Conta();

        System.out.print("Nome do correntista: ");
        conta.correntista = sc.next();

        conta.numero = rd.nextInt(1000, 9999);
        System.out.print("Número da conta: ");
        System.out.println(conta.numero);

        conta.depositar(1000);
        System.out.println( "Saldo Atual(Depositou): " + conta.saldo);

        conta.sacar(250);
        System.out.println("Saldo Atual(Depois de sacar): " + conta.saldo);

        //transferência da conta para conta2
        conta.tranferir(390, conta2);
        System.out.println("Saldo Atual(Após a transferência): " + conta.saldo);
        System.out.println("Saldo da conta 2: " + conta2.saldo);
    }
}
