import java.util.Date;

public class Aluno {

    private String nome;
    private int altura; //altura em cm
    private int idade;
    private Date dataNascimento;
    private final static String TIPO = "ALUNO"; // Tipo de Pessoa

    /**
     * Construtor de Aluno
     * @param nome String nome do Aluno
     * @param altura int Altura em cm
     * @param idade int idade
     * @param dataNascimento Date dataNascimento
     */
    public Aluno(String nome, int altura, int idade, Date dataNascimento){
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
     * Retorna a data de nascimento
     * @return Date
     */
    public Date getDataNascimento() {
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
     * Retorna o nome do Aluno
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
            System.out.print("Erro: A altura tem de ser positiva");


    }

    /**
     * Define uma data de nascimento
     * @param dataNascimento
     */
    public void setDataNascimento(Date dataNascimento) {
        if (dataNascimento.before(new Date()))
            this.dataNascimento = dataNascimento;
        else
            System.out.print("Erro: Data de nascimento inválida. Tem de ser menos que a Data de Hoje");


    }

    /**
     * Define uma idade
     * @param idade
     */
    public void setIdade(int idade) {
        if(idade > 0)
            this.idade = idade;
        else
            System.out.print("Erro: A idade tem de ser positiva");

    }

    /**
     * Adiciona o nome
     * @param nome
     */
    public void setNome(String nome) {
        if (nome != null && !nome.equals(""))
            this.nome = nome;
        else
            System.out.print("Erro: Nome inválido");

    }

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
            System.out.print("Erro: Nome inválido");

    }

    @Override
    public String toString() {
        return "O " + this.TIPO + " " + this.nome + " tem " + this.idade + " anos e " + this.altura + " cm . Nasceu no dia " +
                this.dataNascimento.getDay() + ",no mês " + this.dataNascimento.getMonth() + " no ano " +
                this.dataNascimento.getYear() + ".";
    }


}
