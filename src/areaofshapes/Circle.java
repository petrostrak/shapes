
package areaofshapes;

public class Circle extends Shape{
    private int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 1 * Math.PI * Math.pow(radius, 2);
        return perimeter;
    }
}
 