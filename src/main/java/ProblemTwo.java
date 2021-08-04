import java.util.ArrayList;
import java.util.Arrays;


public class ProblemTwo {
    public static int[] minMax(int[] arr) {

        int[] result = new int[2];
        Arrays.sort(arr);
        result[0] = arr[0];
        result[1] = arr[arr.length - 1];

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 5, 6, 1, 4, 2 };

        arr1 = minMax(arr1);
        for (int i : arr1) {
            System.out.println("Result: "+i);
        }
    }
}
