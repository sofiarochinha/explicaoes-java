import java.text.DecimalFormat;

public class Produto implements Validade{

    String nome = "Produto1";

    @Override
    public int getValidade() {
        return anos;
    }


    class ProductLang {
        String descricao = "Produto1 descricao";
    }

    class ProductPrice {
        int price = 10;
    }



    public double getPrecoComIva(){
        double iva = 1.23;

        class PrecoIva{
            public ProductPrice productPrice;

            public PrecoIva(){
                productPrice = new ProductPrice();
            }

            public double getProductPrice() {
                double preco = productPrice.price * iva;
                return preco;
            }

        }
        PrecoIva precoIva = new PrecoIva();
        return precoIva.getProductPrice();
    }
}
