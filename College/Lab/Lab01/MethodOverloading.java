public class MethodOverloading {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) throws Exception {
        MethodOverloading m = new MethodOverloading();
        System.out.println("Sum of 1 & 3: " + m.sum(1, 3));
        System.out.println("Sum of 4.5, 6.2 & 6.8: " + m.sum(4.5F, 6.2F, 6.8F));
        System.out.println("Sum of 3, 5 & 9: " + m.sum(3, 5, 9));
        System.out.println("Name: Roman Ojha");
        System.out.println("Roll.NO: 25");
    }
}
