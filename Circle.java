import static java.lang.Math.PI;
interface Shape {
    void area();
    void perimeter();
}
class Circle implements Shape {
    int radius;
    Circle(int r) {
        radius = r;
    }
    @Override
    public void area() {
        System.out.printf("Area of circle with radius %d is: %f\n", radius, (PI * radius * radius));
    }
    @Override
    public void perimeter() {
        System.out.printf("Perimeter of circle with radius %d is: %f\n", radius, (2 * PI * radius));
    }
}
class Rectangle implements Shape {
    int length, breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    @Override
    public void area() {
        System.out.printf("Area of rectangle with length and breadth of %d, %d is: %d\n", length, breadth, 
                (length * breadth));
    }
    @Override
    public void perimeter() {
        System.out.printf("Perimeter of rectangle with length and breadth of %d, %d is: %d\n", length, breadth,
                (2 * (length + breadth)));
    }
}
class Square implements Shape {
    int side;
    Square(int s) {
        side = s;
    }
    @Override
    public void area() {
        System.out.printf("Area of square with side %d is: %d\n", side, (side * side));
    }
    @Override
    public void perimeter() {
        System.out.printf("Perimeter of square with side %d is: %d\n", side, (4 * side));
    }
}
class Program {
    public static void main(String[] args) {
        Circle c = new Circle(8);
        c.area();
        c.perimeter();
        System.out.println();
        Rectangle r = new Rectangle(5, 4);
        r.area();
        r.perimeter();
        System.out.println();
        Square s = new Square(3);
        s.area();
        s.perimeter();
    }
}