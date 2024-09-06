package Arrays;

import java.util.*;

public class RearrangeElementsBySigns {
    public static void main(String[] args) {
        // Array Initialization.
        int[] A = {1, 2, -4, -5};
        int[] ans = RearrangebySign(A);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] RearrangebySign(int[] A) {
        int n = A.length;

        // Define array for storing the ans separately.
        int[] ans = new int[n];

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and increment by 2.
            if (A[i] < 0) {
                ans[negIndex] = A[i];
                negIndex += 2;
            }

            // Fill positive elements in even indices and increment by 2.
            else {
                ans[posIndex] = A[i];
                posIndex += 2;
            }
        }

        return ans;
    }
}
