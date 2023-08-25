package Pessoa;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private int numeroAluno;
    private Curso curso;

    public Aluno(String nome, int altura, int idade, LocalDate dataNascimento, int numeroAluno, Curso curso) throws Exception {
        super(nome, altura, idade, dataNascimento);
        setNumeroAluno(numeroAluno);
        setCurso(curso);
        setNome("sofia");

    }

    @Override
    public void setNome(String nome){
        super.setNome("A" + nome);
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
                super.getDataNascimento().getYear() + "." + "Numero de aluno:" + this.numeroAluno +
                " Curso: " + this.curso;
    }
}
