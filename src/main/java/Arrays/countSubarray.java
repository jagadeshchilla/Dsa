package Arrays;
import java.util.*;
public class countSubarray {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }

    private static int findAllSubarraysWithGivenSum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, preSum = 0;
        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;

            count += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
