package Arrays;

public class StocksBuyAndSell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);

    }

    private static int maxProfit(int[] arr) {
        int mini=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        return profit;
    }
}
