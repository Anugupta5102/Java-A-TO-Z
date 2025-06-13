package DSA.Hashing;

import java.util.Scanner;

public class numberHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //preCompute
        int hash[]=new int[13];//max element can be 12
        for(int i=0;i<n;i++){
            hash[arr[i]] ++;
        }
        System.out.println("Enter query");
        int q=sc.nextInt();
        while (q-- !=0) {
            int num;
            num=sc.nextInt();
            System.out.println(hash[num]);
            
        }
    }
}
