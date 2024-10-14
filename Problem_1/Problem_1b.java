/**
 * Print the number of items in the array by using an expression of the form
x.length.
 */

package Problem_1;

import java.util.Arrays;

public class Problem_1b {

    public static void main(String[] args) {
        double[] arr = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("The number of items in the array: " + arr.length);
    }

}
