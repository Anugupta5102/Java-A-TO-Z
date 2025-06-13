package DSA.Array;

import java.util.Arrays;

/*without using extra space */
public class MergeSorted {
    //O(min(n, m)) + O(n*logn) + O(m*logm)
    public static void merge(int a[],int b[],int n,int m){
        int left=n-1;//1st array-->iterate from last
        int right=0;//2nd array--->iterate from start
        while(left>=0 && right<m){
            if(a[left] > b[right]){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("arr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }


}
