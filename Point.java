class Point {

    int x;
    int y;

    // Default Constructor
    Point() {
        x = 5;
        y = 5;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
        System.out.println("Copy Constructor Called");
    }

    // Display Method
    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }

    // Main Method
    public static void main(String[] args) {

        // Using Default Constructor
        Point p1 = new Point();
        p1.display();
        System.out.println("-------------------");

        // Using Parameterized Constructor
        Point p2 = new Point(10, 20);
        p2.display();
        System.out.println("-------------------");

        // Using Copy Constructor
        Point p3 = new Point(p2);
        p3.display();
	System.out.println("Vraj Fadiya | 240390107007");
    }
}
