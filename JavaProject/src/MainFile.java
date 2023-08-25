import Pessoa.Pessoa;
import Pessoa.Aluno;
import Pessoa.Curso;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFile {

    public static void main(String[] args) throws Exception {


        ArrayList<Pessoa> pessoaArrayList = new ArrayList<Pessoa>();

        pessoaArrayList.add(new Pessoa("Sofia", 2, 12, LocalDate.of(2001,8,20)));
        pessoaArrayList.add(new Pessoa("Sofia2", 4, 15, LocalDate.of(2008,9,20)));
        pessoaArrayList.add(new Pessoa("Sofia3", 3, 18, LocalDate.of(2005,10,20)));

        /**ficheiro normal*/
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        /**escrever num ficheiro binário
         * https://attacomsian.com/blog/java-read-write-binary-files*/

        try (FileOutputStream fos = new FileOutputStream("object.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // create a new user object
            for (Pessoa pessoa : pessoaArrayList) {
                oos.writeObject(pessoa);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }


        /**ficheiro txt
         * https://attacomsian.com/blog/java-read-write-files*/
        try {
            // create a writer
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            for (Pessoa pessoa : pessoaArrayList) {
                bw.write(pessoa.toString());
                bw.newLine();
            }


            // close the writer
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
