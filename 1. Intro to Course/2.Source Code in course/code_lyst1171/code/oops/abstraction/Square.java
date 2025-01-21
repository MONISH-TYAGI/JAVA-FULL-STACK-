public class Square extends Shape {
    int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public void calculatePerimeter() {
        // child class specific functionality
        System.out.println("Parimeter of square is " + (4 * this.side));
    }

}
