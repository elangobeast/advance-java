package Feb15;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0, 1, 2, 0, 1};

        // Bubble Sort using if condition
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) { // Swap if current element is greater than next element
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println(Arrays.toString(num)); // Output: [0, 0, 0, 1, 1, 1, 2, 2]
    }
}