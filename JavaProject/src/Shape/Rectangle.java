package Shape;

public class Rectangle extends Shape{
    private double largura;
    private double comprimento;
    public Rectangle (double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }
    @Override
    public double getArea() {
        return largura * comprimento;
    }
}
