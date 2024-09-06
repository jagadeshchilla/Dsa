package Arrays;

import java.util.*;

class hash{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(freq(arr,n));
    }

    public static int freq(int[] arr,int n){
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                int freq=mp.get(arr[i]);
                freq++;
                mp.put(arr[i],freq);
            }
            mp.put(arr[i],1);
        }

        int max=0,res=-1;
        for(Map.Entry<Integer,Integer> val:mp.entrySet()){
            if(max<val.getValue()){
                max=val.getValue();
                res=val.getKey();
            }
        }
        return res;
    }
}
