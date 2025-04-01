class Circle {
    double radius;

    
    public Circle() {
        this(1.0); // Calls the parameterized constructor
    }

    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + ", Area: " + calculateArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        c1.display();
        c2.display();
    }
}
