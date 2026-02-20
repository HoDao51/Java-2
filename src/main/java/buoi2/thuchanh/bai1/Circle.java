package buoi2.thuchanh.bai1;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, double diameter) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getArea(){
        return 2 * Math.PI * radius;
    }
}
