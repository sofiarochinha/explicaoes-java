package Pessoa;

import java.time.LocalDate;

public class Professor extends Pessoa{

    //Professor professor =  new Professor()

//            1 - cria objeto professor
//            2 - verifica os atributos
//            3 - tem super?
//            4 - se sim, cria uma class Pessoa
//                dentro da pessoa:
//                5 - cria objeto professor
//                6 - verifica os atributos
//                7 - tem super?
//                8 - nao tem

    String universidade;
    public Professor(String nome, int altura, int idade, LocalDate dataNascimento) {
        super(nome, altura, idade, dataNascimento); //herdou o construtor
        universidade = "Lisboa";
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

}
