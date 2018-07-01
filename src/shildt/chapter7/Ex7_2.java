package shildt.chapter7;

public class Ex7_2 {
    public static void main(String[] args) {
        TwoDShape circle = new Circle(10);
        System.out.println(circle.area());
    }
}
abstract class TwoDShape{
    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0;
        name = "none";
    }

    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }
    TwoDShape(double x, String n){
        width = height = x;
        name = n;
    }
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
    abstract double area();
}

class Circle extends TwoDShape{
    private double radius;
    public Circle(double radius){
        super(radius, "circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}