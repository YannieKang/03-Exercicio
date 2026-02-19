package Exercicio02;

public class Paciente {
    //atributos ou propriedades ou variáveis de instância
    String nome;
    int idade;
    int cardiacaAlvo;

    //quando tem operações/calculos é metodo
    public int frequenciaMax (){
        return 220 - idade;
    }

    //retornar vetor --> []
    public double[] frequenciaAlvo() {
        double[] alvo = new double[2];
        int frequencia = frequenciaMax();
        alvo[0] = frequencia * 0.5;
        alvo[1] = frequencia * 0.85;
        return  alvo;
    }

}
