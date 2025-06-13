package DSA.Stack;

public class TrappingRainwater {
    /* total units of water stored in b/w buildings
     * taller on left and right then only water can log in b/w
     * 
     * Better-O(N)-TC, O(n)-SC
     * sum of min(leftmax,rightmax) - ar[i]
     * prefixmax-->leftmax, suffixmax-->rightmax 
     * 
     * Optimal- O(n)-TC, O(1)-SC
     * 2 pointer approach
     * left=0,right=n-1; 
     * 
     */
    public static int trap(int height[]){
        int n=height.length;
        int left=0;
        int right=n-1;
        int lmax=height[left];
        int rmax=height[right];
        int ans=0;

        while (left < right) {
            //take min ht
            if(height[left]<height[right]){
                lmax=Math.max(lmax, height[left]);
                ans += lmax - height[left];
                left++;
            }
            else{
                rmax=Math.max(rmax, height[right]);
                ans += rmax - height[right];
                right--;
            }
            
        }
        return ans;
    }
    public static void main(String args[]) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The water that can be trapped is " + trap(arr));
    }
    
}
