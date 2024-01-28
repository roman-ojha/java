package Q6;

public class Distance {
    private int feet;
    private int inches;
    private int distance;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void addDistance() {
        this.distance = (12 * this.feet) + inches;
    }

    public void displayDistance() {
        System.out.println("Total Distance in inches: " + this.distance);
    }
}
