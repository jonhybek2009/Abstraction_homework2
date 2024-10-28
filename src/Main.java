//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4,6);
        Shape square = new Square(4);
        Shape triangle = new Triangle(3,4,5);
        Shape pentagon = new pentagon(7);

        System.out.println("Периметр круга " + circle.getPerimeter());
        System.out.println("Периметр прямоугольника " + rectangle.getPerimeter());
        System.out.println("Периметр квадрата " + square.getPerimeter());
        System.out.println("Периметр треугольника " + triangle.getPerimeter());
        System.out.println("Периметр пятиугольника " + pentagon.getPerimeter());

    }
}