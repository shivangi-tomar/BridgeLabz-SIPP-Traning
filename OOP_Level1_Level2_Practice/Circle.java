class Circle {
    double radius;

    Circle() {
        this(1.0); // default value
    }

    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);
        c1.display();
        c2.display();
    }
}
