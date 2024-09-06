package Arrays;

public class MaxSubArraySum {
    public static void main(String args[]) {
        int[] arr = { -2,-3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

    private static long maxSubarraySum(int[] arr, int n) {
        long maxi=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxi) maxi=sum;
            if(sum<0) sum=0;

        }
        return maxi;
    }
}
