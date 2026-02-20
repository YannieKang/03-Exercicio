package Exercicio03;

public class Professor {
    String nome;
    double valorAula;
    int totalAula;

    public double salarioBase(){
        return totalAula * 4.5 * valorAula;
    }

    public double horaAdicional(){
        return salarioBase() * 0.05;
    }

    public double descansoSemanal(){
        return (salarioBase() + horaAdicional()) / 6;
    }

    public double salarioBruto(){
        return salarioBase() + horaAdicional() + descansoSemanal();
    }




}
