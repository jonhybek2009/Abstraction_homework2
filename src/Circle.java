public class Circle extends Shape{
    private  double radius;

    public  Circle(double radius){
        this.radius=radius;
    }
    @Override
    public  double getPerimeter(){
        return 2 * 3.14 * radius;
    }
}
