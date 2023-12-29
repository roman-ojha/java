public class JaggedArrayQ4 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                new int[] { 10, 20, 30 },
                new int[] { 40 },
                new int[] { 50, 60 },
                new int[] { 22, 34, 64, 12 },
        };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of row " + i + " is: " + sum);
        }
    }
}
