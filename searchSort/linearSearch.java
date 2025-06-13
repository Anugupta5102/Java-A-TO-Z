package searchSort;

import java.util.Scanner;

public class linearSearch {
    public static int linear(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search");
        int num=sc.nextInt();
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==num){
                System.out.print("Element found at index : ");
                return i;
            }
        }
        System.out.print("Not Found ");
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,4,1};
        System.out.println(linear(arr));
    }
}
