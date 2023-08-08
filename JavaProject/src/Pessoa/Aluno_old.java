package Pessoa;

import java.time.LocalDate;

public class Aluno_old {

    private String nome;
    private int altura; //altura em cm
    private int idade;
    private LocalDate dataNascimento;
    private final static String TIPO = "ALUNO"; // Tipo de Pessoa

    /**
     * Variável que não é único para cada elemento
     * https://www.javatpoint.com/static-keyword-in-java
     */
    private static String curso = "Informática";

    /**
     * Construtor de Pessoa.Aluno
     * @param nome String nome do Pessoa.Aluno
     * @param altura int Altura em cm
     * @param idade int idade
     * @param dataNascimento Date dataNascimento
     */
    public Aluno_old(String nome, int altura, int idade, LocalDate dataNascimento){
//        this.nome = nome;
//        this.altura = altura;
//        this.idade = idade;
//        this.dataNascimento = dataNascimento;

        setNome(nome);
        setAltura(altura);
        setIdade(idade);
        setDataNascimento(dataNascimento);

    }

    /**
     * Obtém o curso Pessoa.Aluno
     * @return String
     */
    public static String getCurso() {
        return curso;
    }

    /**
     * Obtém o tipo de Pessoa
     * @return String
     */
    public static String getTIPO() {
        return TIPO;
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
            System.out.println("Erro: A altura tem de ser positiva");


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
    public void setIdade(int idade) {
        if(idade > 0)
            this.idade = idade;
        else
            System.out.println("Erro: A idade tem de ser positiva");

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

    //Object object = null --> objecto não está inicializado
    //nome = null ---->  variável não está inicializada
    //nome = ""  ----> 12345
    //nome.equals("")

    //String nome = new String("nome")
    //String nome = "nome"



    /**
     * Overload
     * Adiciona o nome
     * @param primeiroNome
     * @param ultimoNome
     */
    public void setNome(String primeiroNome, String ultimoNome) {
        if (primeiroNome != null && !primeiroNome.equals("") && ultimoNome != null && !ultimoNome.equals(""))
            this.nome = primeiroNome + " " + ultimoNome;
        else
            System.out.println("Erro: Nome inválido");

    }

    /**
     * Método override
     * @return String
     */
    @Override
    public String toString() {
        return "O " + this.TIPO + " " + this.nome + " tem " + this.idade + " anos e " + this.altura + " cm. Nasceu no dia " +
                this.dataNascimento.getDayOfMonth() + ", no mês " + this.dataNascimento.getMonth() + " no ano " +
                this.dataNascimento.getYear() + ".";
    }





}
