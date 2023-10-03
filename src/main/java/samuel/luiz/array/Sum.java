package samuel.luiz.array;

import java.util.Arrays;

public class Sum {
    public int sumOfArray(int[] arr) {
        return Arrays.stream(arr)
                .sum();
    }

    public void run(int[] arr) {
        System.out.println("The sum of the array is equal to " + sumOfArray(arr));
    }
}
