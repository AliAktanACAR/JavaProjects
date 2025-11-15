public class TalipHoca7 {
    public static void main(String[] args) {
        CircleRunner circle1 = new CircleRunner(10);
        CircleRunner circle2 = new CircleRunner(20);
        CircleRunner circle3 = new CircleRunner(30);

        System.out.println(circle1.perimeter);
        System.out.println(circle2.perimeter);
        System.out.println(circle3.perimeter);

        System.out.println(circle1.area);
        System.out.println(circle2.area);
        System.out.println(circle3.area);

    }
}

class CircleRunner {
    int radius;
    double perimeter;
    double area;

    CircleRunner(int radius) {
        this.radius = radius;
        this.perimeter = calculatePerimeter(radius);
        this.area = calculateArea(radius);
    }

    public double calculatePerimeter(int radius) {
        return radius * 2 * Math.PI;
    }

    public double calculateArea(int radius) {
        return radius * radius * Math.PI;
    }
}
