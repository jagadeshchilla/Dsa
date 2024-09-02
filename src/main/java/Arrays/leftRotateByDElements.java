package Arrays;

public class leftRotateByDElements {
    public static void reverse(int [] arr, int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void Rotateeletoright(int []arr,int n,int k){
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        Rotateeletoright(arr, n, k);
        System.out.print("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
