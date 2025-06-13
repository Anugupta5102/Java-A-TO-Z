package DSA.Binary_Search;
/*median-middle value
 * even- avg(n/2 + n/2+1)
 * odd- n+1/2
 * binary search(smaller array)-optimal
 * a1[l1,r1] & a2[l2,r2]--->l=left, r=right 
 * symmetry on basis of how many a1[i],a2[j] on left and how many a1[i],a2[j] on right
 * check for valid symmetry- cross elements- left a1[i]<a2[j] 
 * l1>r2=>high=mid-1; l2>r1=>low=mid+1
 * elements req on left side- n1+n2+1/2
 * find median--->
 * max[l1,l2]+min[r1,r2]/2-even
 * max[l1,l2]-odd 
 */
public class MedianOfTwoSorted {
    public static double medianArrays(int ar1[],int ar2[]){
        int n1= ar1.length;//4
        int n2=ar2.length;//6
        //find smaller array; if a1>a2 swap
        if(n1 > n2) return medianArrays(ar2, ar1);
        int len=n1+n2;//eg 10
        int leftLen=(n1+n2+1)/2;//len of left half(element on left)
        //apply bs
        int low=0;
        int high=n1;//eg 4
        while(low <= high){
            int mid1=(low+high)/2;//pick half from ar1--> 4/2=2
            int mid2=leftLen-mid1;//pick rem from ar2-->5-2=3
            //find l1,l2,r1,r2
            int l1=(mid1 > 0) ? ar1[mid1-1] : Integer.MIN_VALUE;//if no value on left then take min value to compare
            int l2=(mid2 > 0) ? ar2[mid2-1] : Integer.MIN_VALUE;
            int r1=(mid1 < n1) ? ar1[mid1] : Integer.MAX_VALUE;//if no value on right then take max value to compare
            int r2=(mid2 < n2) ? ar2[mid2] : Integer.MAX_VALUE;

            //symmetry case
            if(l1<=r2 && l2<=r1){
                if(len % 2==1) return Math.max(l1, l2);//odd median
                else return ((double)(Math.max(l1, l2) + Math.min(r1, r2))/2.0);//even
            }
            else if(l1 > r2) {
                high=mid1 - 1;
            }
            else{
                low=mid1 + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 10, 12,18};
        int[] b = {2, 3, 6, 15};
        System.out.println("The median of two sorted arrays is " + medianArrays(a, b));
    }
}
