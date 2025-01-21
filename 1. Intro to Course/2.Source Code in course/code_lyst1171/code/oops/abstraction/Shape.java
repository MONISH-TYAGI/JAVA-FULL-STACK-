abstract class Shape {
    int length;
    int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // concrete method
    public void calculateArea() {
        System.out.println("calulating area..");
        System.out.println("Area is " + (this.length * this.breadth));
    }

    // abstract method
    abstract public void calculatePerimeter();
}