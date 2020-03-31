
package areaofshapes;

public class Square extends Shape{
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    public double getArea(){
        double area = side * side;
        return area;
    }
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
}
