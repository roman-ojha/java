package Q5;

public class Circle {
    private float radius;
    private float pie = 3.14159F;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float findArea() {
        return this.pie * (this.radius * this.radius);
    }

    public float findCircumference() {
        return 2 * this.pie * this.radius;
    }
}
