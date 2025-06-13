package DSA.Array;
import java.util.ArrayList;
import java.util.List;
public class PascalTriangleNCR {                 //r-1
    /* Q1. Given row(r) & col(c) find element-->   C 
            Use formula:                             c-1
                        nCr= n!/(r!*(n-r)!)
            Short trick**** eg 7C2 = 7x6x(5x4x3x2x1)/2x1x(5x4x3x2x1)
                                   = 7x6/2x1-->n and r goes till same no of places ie r.
                                   = 7/1 * 6/2 
     * Q2. Find nth row--->ans*(row-col)/col
     * Q3. Given n, print triangle-->list of lists
      */

//use long long
/*  Sol 1. function nCr(n,r){
                 long res=1;
                 //cal nCr
                 for(i=0;i<r;i++){
                    res=res*(n-i);//numerator ie n
                    res=res/(i+1);//enominator ie r
                 }
                 return res;--------->TC=O(r) and SC=O(1)
}
                return nCr(r-1,c-1);//call
 */      

/*    Sol 2.    ans=1;
                print(ans)
                for(i=1;i<n;i++){
                ans = ans*(n-i);
                ans =ans/i;------->TC=O(n) and SC=O(1)
                print(ans)
} */               

//Sol3.--->O(N^2)-TC , SC-O(1)
public static int nCr(int n,int r){
    long res=1;
    //calculate nCr
    for(int i=0;i<r;i++){
        res=res *(n-i);
        res=res/(i+1);
    }
    return (int)res;
}
public static List<List<Integer>> pascal(int n){
    List<List<Integer>> ans=new ArrayList<>();
    //store entire triangle
    for(int row=1;row<=n;row++){
        List<Integer> temp=new ArrayList<>();
        for(int col=1;col<=row;col++){
            temp.add(nCr(row-1, col-1));
        }
        ans.add(temp);
    }
    return ans;

}
public static void main(String[] args) {
    int n = 5;
    List<List<Integer>> ans = pascal(n);
    for (List<Integer> it : ans) {
        for (int ele : it) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
}

