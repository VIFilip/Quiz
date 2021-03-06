public class Main {
    public static void main(String[] args) {

        // Rectangle calculation
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Square calculation
        double side = 2;
        Shape Square = new Square(side);
        System.out.println("Square side: " + side
                + "\nResulting area: " + Square.area()
                + "\nResulting perimeter: " + Square.perimeter() + "\n");



        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.area()
                + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }
}



