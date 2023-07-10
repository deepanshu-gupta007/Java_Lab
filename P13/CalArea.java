abstract class Shape {
    abstract double rectangleArea(double len,double br);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}
class Area extends Shape {
    double rectangleArea(double length,double breadth) {
        return length * breadth;
    }
    double squareArea(double side) {
        return side * side;
    }
    double circleArea(double radius) {
        return (22.0/7.0) * radius * radius;
    }
}
public class CalArea {
    public static void main(String arg[]) {
        Shape sp=new Area();
        System.out.println("Rectangle Area: "+sp.rectangleArea(10, 5)); 
        System.out.println("Square Area: "+sp.squareArea(5)); 
        System.out.println("Circle Area: "+sp.circleArea(7));
    }
}
