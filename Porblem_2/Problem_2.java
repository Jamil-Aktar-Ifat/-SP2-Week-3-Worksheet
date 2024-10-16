package Porblem_2;
public class Problem_2 {
    public static void main(String[] args) {
        double[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
        System.out.println("Before rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        double[] rotatedArray = rotate(x, 4);
        System.out.println("After rotation: ==============================");
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.println("x[" + i + "]: " + rotatedArray[i]);
        }
    }

    static double[] rotate(double[] arr, int positions) {
        int length = arr.length;
        double[] rotated = new double[length];
        for (int i = 0; i < length; i++) {
            rotated[(i + positions) % length] = arr[i];
        }
        return rotated;
    }

}
