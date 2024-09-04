package Arrays;

import java.util.HashMap;
import java.util.Map;

public class longestSubarrayWithSumK_PN {
    public static int getLongestSubarray(int[] a, long k) {
        int n=a.length;
        Map<Long,Integer> PreSum=new HashMap<>();
        long sum=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            sum+=a[i];

            if(sum==k){
                maxlen=Math.max(maxlen, i+1);
            }

            long rem=sum-k;
            if(PreSum.containsKey(rem)){
                int len=i-PreSum.get(rem);
                maxlen=Math.max(maxlen, len);
            }
            if(!PreSum.containsKey(sum)){
                PreSum.put(sum, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }


}
