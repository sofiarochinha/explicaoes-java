public class Circle implements Shape
{
    private double radious;

    public  Circle (double radious){
        this.radious = radious;
    }

    @Override
    public double getArea() {
        return (Math.PI * radious * radious);
    }
}