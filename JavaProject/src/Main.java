import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Aluno1", 150, 12, LocalDate.of(2001,8,20));
        Aluno aluno2 = new Aluno("Aluno2", 145, 13, LocalDate.of(2004,9,2));

        System.out.println(aluno1);
        System.out.println(aluno2);

    }
}