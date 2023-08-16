package Pessoa;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private int numeroAluno;
    private Curso curso;

    public Aluno(String nome, int altura, int idade, LocalDate dataNascimento, int numeroAluno, Curso curso) {
        super(nome, altura, idade, dataNascimento);
        setNumeroAluno(numeroAluno);
        setCurso(curso);

    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    /**
     * Define o numero de Aluno
     * @param numeroAluno
     */
    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    /**
     * Obtém o numero de aluno
     * @return int
     */
    public int getNumeroAluno() {
        return numeroAluno;
    }

    @Override
    public String toString() {
        return "O aluno " + super.getNome() + " tem " + super.getIdade() + " anos e " + super.getAltura() + " cm. Nasceu no dia " +
                super.getDataNascimento().getDayOfMonth() + ", no mês " +  super.getDataNascimento().getMonth() + " no ano " +
                super.getDataNascimento().getYear() + ".";
    }
}
