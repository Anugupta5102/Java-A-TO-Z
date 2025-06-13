package DSA.Array;

public class FirstMissingPve {

    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            //move all positive to correct position
            while(nums[i] > 0 && nums[i] < n && nums[i] != nums[nums[i]-1]){
                //swap to correct pos
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        //find first missing
        for(int i=0;i<n;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int nums[]={3,4,-1,1};
        int missing=firstMissingPositive(nums);
        System.out.println("First missing positive number is: " + missing);

    }
}
