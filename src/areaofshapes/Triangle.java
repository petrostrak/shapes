
package areaofshapes;

public class Triangle extends Shape{
    private double side;
    private double base;
    private double height;
    
    public Triangle(double base, double height, double side){
        this.base = base;
        this.height = height;
        this.side = side;
    }
    
    public double getArea(){
        double area = (base * height) / 2;
        return area;
    }
    @Override
    public double getPerimeter(){
        return side * 3;
    }
}
