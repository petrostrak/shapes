
package areaofshapes;

import java.util.ArrayList;
import java.util.List;

public class AreaOfShapes {

    public static void main(String[] args) {
        List<Shape> sximata = new ArrayList();
        Shape t1 = new Triangle(3, 3, 3);
        Shape sq1 = new Square(5);
        Circle c1 = new Circle(4);
        sximata.add(t1);
        sximata.add(sq1);
        sximata.add(new Circle(3));
        
        for(Shape area : sximata){
            System.out.println(area.getArea());
        }
        for(Shape perimeter : sximata){
            System.out.println(perimeter.getPerimeter());
        }
    }
    
}
