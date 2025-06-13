package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

/*Brute force--> merge sort=>O(nlogn)
         * Better---->Count 0,1,2 then for each of them loop over and assign values--ar[i]=0/1/2;---->O(2N)
         * Optimal---->DNF(Dutch National Flag algo)-->3 pointers
         * [0...low-1]->0
         * [low...mid-1]->1
         * (mid......high-------->unsorted array)
         * [high+1....n-1]->2
         */
        /*ALGO -: mid=low=0; high=n-1;
                  a[mid]==0,then swap(a[low],a[mid]); low++; mid++
         *        a[mid]==1,then mid++;
         *        a[mid]==2,then swap(a[mid],a[high]); high--
         */
public class Sort0s1s2s {
    public static void sort(ArrayList<Integer> arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while (mid<=high) {
            if(arr.get(mid) == 0){
                //swap low,mid
                int temp=arr.get(low);
                arr.set(low, arr.get(mid));//element at index
                arr.set(mid, temp);//index,element
                
                low++;
                mid++;
        }
        else if(arr.get(mid) == 1){
            mid++;
        }
        else{//mid==2
            //swap mid,high
            int temp=arr.get(mid);
            arr.set(mid, arr.get(high));
            arr.set(high, temp);
            
            high--;
        }
    }
}
    //O(N)-TC    and   O(1)-SC
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{0,2,1,2,0,1}));
        int n=6;
        sort(arr, n);
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");

        }
        System.out.println();
     
    }
}
