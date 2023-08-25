import Pessoa.Pessoa;
import Pessoa.Aluno;
import Pessoa.Curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        int selection = 0;
        Scanner input = new Scanner(System.in);

        while(selection != 3){

            /***************************************************/

            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - Criar uma pessoa");
            System.out.println("2 - Criar um aluno");
            System.out.println("3 - Quit");

            selection = input.nextInt();
            input.nextLine();

            switch (selection){
                case 1:
                    String nome;
                    int altura;
                    int idade;
                    LocalDate dataNascimento;

                    System.out.println("Insira o nome: ");
                    nome = input.nextLine();

                    System.out.println("Insira a altura: ");
                    altura = input.nextInt();
                    input.nextLine();

                    System.out.println("Insira a idade: ");
                    idade = input.nextInt();
                    input.nextLine();

                    System.out.println("Insira a data de nascimento (YYYY-MM-DD): ");
                    String data = input.nextLine();

                    dataNascimento = LocalDate.parse(data, formatter);
                    try{
                        Pessoa pessoa = new Pessoa(nome, altura, idade, dataNascimento);
                        System.out.println(pessoa);
                    }catch (Exception ex){
                        System.out.println("Ocorreu um erro: " + ex);
                    }

                    break;
                case 2:
                    String nomeAluno;
                    int alturaAluno;
                    int idadeAluno;
                    LocalDate dataNascimentoAluno;

                    System.out.println("Insira o nome: ");
                    nomeAluno = input.nextLine();

                    System.out.println("Insira a altura: ");
                    alturaAluno = input.nextInt();
                    input.nextLine();

                    while(alturaAluno <= 0){
                        System.out.println("A altura tem de ser maior que zero. Altura a idade: ");
                        alturaAluno = input.nextInt();
                        input.nextLine();
                    }

                    System.out.println("Insira a idade: ");
                    idadeAluno = input.nextInt();
                    input.nextLine();

                    while(idadeAluno <= 0){
                        System.out.println("A idade tem de ser maior que zero. Insira a idade: ");
                        idadeAluno = input.nextInt();
                        input.nextLine();
                    }

                    System.out.println("Insira a data de nascimento (YYYY-MM-DD): ");
                    String dataAluno = input.nextLine();

                    dataNascimentoAluno = LocalDate.parse(dataAluno, formatter);
                    int numeroAluno = (int)(Math.random()*100);
                    try {
                        Aluno aluno = new Aluno(nomeAluno, alturaAluno, idadeAluno, dataNascimentoAluno, numeroAluno, Curso.CIENCIAS);
                        System.out.println(aluno);
                    }catch (Exception ex){
                        System.out.println("Ocorreu um erro: " + ex);
                    }finally {
                        System.out.println("Pode criar de novo aluno");
                    }
                    break;
                case 3:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }
}
