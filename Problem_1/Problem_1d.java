package Problem_1;

/**
 * Print the last array item. Be careful to choose the right index.
 */
public class Problem_1d {

    public static void main(String[] args) {
        double[] arr = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
        // System.out.println("The last item of the array: " + arr[arr.length - 1]);

        // problem_1f
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " at arr[" + i +"]");
        }
        // problem_1h--> printing array in a reverse order
        System.out.println("----------Reverse Array------------");
        for (int i = (arr.length - 1 ); i >= 0; i--) {
            System.out.println(arr[i] + " at arr[" + i +"]");
        }

    }
}