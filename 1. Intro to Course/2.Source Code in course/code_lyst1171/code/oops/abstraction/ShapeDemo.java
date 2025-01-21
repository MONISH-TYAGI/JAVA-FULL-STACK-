/**
 * ShapeDemo
 */
public class ShapeDemo {

    public static void main(String[] args) {
        Shape shape = new Rectangle(20, 3);
        shape.calculateArea();
        shape.calculatePerimeter();

        Shape shape2 = new Square(5);
        shape2.calculateArea();
        shape2.calculatePerimeter();

    }
}