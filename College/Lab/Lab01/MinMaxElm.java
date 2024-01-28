public class MinMaxElm {
    public static void main(String[] args) {
        int[] elm = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int min = elm[0];
        int max = elm[0];
        for (int i = 1; i < elm.length; i++) {
            if (min > elm[i]) {
                min = elm[i];
            }
            if (max < elm[i]) {
                max = elm[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Name: Roman Ojha");
        System.out.println("Roll.NO: 25");
    }
}