package Exercicio01;

public class Conta {
    //atributos ou propriedades ou variáveis de instância
    int numero;
    double saldo;
    String correntista;

    //metodo para depositar um valor
    //void -> não tem retorno
    public void depositar(double valor){

        saldo = saldo + valor;
    }

    //metodo para sacar um valor
    public void sacar (double valor){

        saldo = saldo - valor;
    }
}
