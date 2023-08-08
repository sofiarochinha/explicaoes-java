import Pessoa.Aluno;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        Aluno aluno1 = new Aluno("Aluno1", 150, 12, LocalDate.of(2001,8,20));
//        Aluno aluno2 = new Aluno("Aluno2", 145, 13, LocalDate.of(2004,9,2));
//
//        System.out.println(aluno1);
//        System.out.println(aluno2);

        Produto produto = new Produto();

        Produto.ProductPrice productPrice = produto.new ProductPrice();
        Produto.ProductLang productLang = produto.new ProductLang();

        System.out.print("Nome do produto: " + produto.nome +
        "\nPreco do produto s/Iva: "+productPrice.price +
        "\nDescricao do produto: "+ productLang.descricao
        + "\nPreco do produto c/Iva: " + produto.getPrecoComIva() +
        "\nValidade: " + produto.getValidade() + " anos");
    }
}