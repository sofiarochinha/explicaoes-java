package Pessoa;

import Exceptions.AlturaExpection;

import java.io.Serializable;
import java.time.LocalDate;

public class Pessoa implements Serializable {

    private String nome;
    private int altura, idade;

    private LocalDate dataNascimento;

    public Pessoa(String nome, int altura, int idade, LocalDate dataNascimento) throws Exception {

        setNome(nome);
        setAltura(altura);
        setIdade(idade);
        setDataNascimento(dataNascimento);

    }

    /**
     * Retorna a data de nascimento
     * @return Date
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Retorna a altura
     * @return int
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Retorna a idadde
     * @return int
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna o nome do Pessoa.Aluno
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define a altura
     * @param altura
     */
    public void setAltura(int altura) {
        if(altura > 0)
            this.altura = altura;
        else
            throw new AlturaExpection();


    }

    /**
     * Define uma data de nascimento
     * @param dataNascimento
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.isBefore(LocalDate.now()))
            this.dataNascimento = dataNascimento;
        else
            System.out.println("Erro: Data de nascimento inválida. Tem de ser menos que a Data de Hoje");


    }

    /**
     * Define uma idade
     * @param idade
     */
    public void setIdade(int idade) throws Exception {
        if(idade > 0)
            this.idade = idade;
        else
            throw new Exception("A idade tem de ser positiva");

    }

    /**
     * Adiciona o nome
     * @param nome
     */
    public void setNome(String nome) {
        if (nome != null && !nome.equals(""))
            this.nome = nome;
        else
            System.out.println("Erro: Nome inválido");
    }

    /**
     * Método override
     * @return String
     */
    @Override
    public String toString() {
        return "Chamo-me " + this.nome + " e tenho " + this.idade + " anos e " + this.altura + " cm. Nasci no dia " +
                this.dataNascimento.getDayOfMonth() + ", no mês " + this.dataNascimento.getMonth() + " no ano " +
                this.dataNascimento.getYear() + ".";
    }
}
