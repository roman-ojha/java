package Q5;

public class MyCircle {
    public static void main(String[] args) {
        int radius = 10;
        Circle c = new Circle(radius);
        System.out.println("Area of circle having radius " + radius + " is: " + c.findArea());
        System.out.println("Circumference of circle having radius " + radius + " is: " + c.findCircumference());
    }
}
