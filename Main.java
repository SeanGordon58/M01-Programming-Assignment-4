public class Main {
    public static void main(String[] args) {
        // Create RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display properties and area for each object
        displayInfo(polygon1);
        displayInfo(polygon2);
        displayInfo(polygon3);
    }

    private static void displayInfo(RegularPolygon polygon) {
        System.out.println("Number of sides: " + polygon.getN());
        System.out.println("Side length: " + polygon.getSide());
        System.out.println("Center coordinates: (" + polygon.getX() + ", " + polygon.getY() + ")");
        System.out.println("Perimeter: " + polygon.getPerimeter());
        System.out.println("Area: " + polygon.getArea());
        System.out.println();
    }
}