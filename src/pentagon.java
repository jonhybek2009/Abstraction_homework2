public class pentagon extends Shape{
    private double side;

    public pentagon(double side){
        this.side=side;
    }
    @Override
    public  double getPerimeter(){
        return 5 * side;
}}
