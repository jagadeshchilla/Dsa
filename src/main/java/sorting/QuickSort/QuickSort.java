package sorting.QuickSort;

import java.util.List;

public class QuickSort {
    private static  int quickSort(List<Integer> arr,int low,int high){
        int pivot= arr.get(low);
        int i=low;
        int j=high;
        while(i<j){
            while(arr.get(i)<= arr.get(pivot) && i<=high-1){
                i++;
            }
            while (arr.get(j)>arr.get(pivot) && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    public static  void qs(List<Integer> arr,int low,int high){
        if(low<high){
            int pIndex=quickSort(arr,low,high);
            qs(arr,low,pIndex-1);
            qs(arr,pIndex+1,high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr,0,arr.size()-1);
        return arr;
    }
}
