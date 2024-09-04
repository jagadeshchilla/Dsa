package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String args[]) {
        int nums[] = { 1, 0, 1, 1, 0, 1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else {
                count=0;
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}
