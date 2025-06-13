package DSA.Binary_Search;
/*find min(max) */

//array[i] containing pages of book
        /*Each student m should get book
         * each book should be allocated
         * allocation in contiguous manner
         * assign book such that max pages book should be assigned to min students
         * eg. 10,20,30,40
         *     10| 20 30 40--->max=90(20+30+40)
         *     10 20| 30 40--->max=70(30+40)
         *     10 20 30| 40--->max=60(10+20+30)
         *     Now calculate minimum from (90,70,60)---->60
        */
public class BookAllocation {
    //use BS-->[max,sum]
    public static int allocate(int arr[],int m){
        int n=arr.length;

        int low=0;
        int sum=0;
        for(int i=0; i<n;i++){
            sum += arr[i];
        }
        int high=sum;
        int ans=-1;
        while (low<=high) {
            int mid=(low+high)/2;

            if(isPossible(arr,m,mid)){
                ans=mid;
                high=mid-1;//soloution exits ,left part(min sol)
            }
            else{
                low=mid+1;//no sol,go to right
            }
            
        }
        return ans;//low

    }
    public static boolean isPossible(int arr[],int m, int mid){//m=students and mid=pages
        int n=arr.length;
        int studentCount=1;
        int pgSum=0;
        for(int i=0;i<n;i++){
            if(pgSum + arr[i] <= mid){
                pgSum += arr[i];
            }
            else{
                studentCount++;
                if(studentCount > m || arr[i] > mid){
                    return false;

                }
                pgSum = arr[i];

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int res=allocate(arr, 2);
        System.out.println("Book pages allocated: " + res);
        
        
    }
}
