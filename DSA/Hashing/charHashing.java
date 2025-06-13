package DSA.Hashing;

import java.util.Scanner;

public class charHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        //preCompute
        int hash[]=new int[26];//total lowercase alphabets
        //int[256]--->total
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a'] ++;//lower case ASCII (a=97 and A=65)
            //hash[s.charAt(i)]++
        }
        System.out.println("Enter query");
        int q=sc.nextInt();
        while(q-- != 0){
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch - 'a']);
            //sout(hash[ch])

        }
        
    }
}
