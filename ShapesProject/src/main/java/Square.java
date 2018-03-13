public class Square extends Shape {
    private final double width, length; //sides

    public Square(double side) {
        this(2,2);
    }
    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = side * side
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 4 x side
        return 4 * (length);
    }

}