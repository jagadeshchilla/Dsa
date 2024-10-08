package Arrays;

public class longestSubarrayWithSumK_p {
    public static int getLongestSubarray(int[] a, long k) {
        int n=a.length;
        int left=0;
        int right=0;
        long sum=a[0];
        int maxLen=0;

        while(right<n){
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;

            if(right<n) sum+=a[right];

            while(left<=right&& sum>k){
                sum-=a[left];
                left++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }


}
