package DSA.Stack;

import java.util.Stack;

public class AreaLargestRectangleInHistogram {
    /*Given an array of integers heights representing the histogram's bar height 
     where the width of each bar is 1 
     return the area of the largest rectangle in histogram.
     area= ar[i]*(nse-pse-1);
     * O(N)+O(N)-TC,   O(N)-SC   
     * push the index in stack,
     * if next is smaller, pop ar[i]
     * using the concept of pse, nse */

     public static int largestArea(int histo[]){
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int n=histo.length;

        for(int i=0;i<=n;i++){
            //move frwd by finding right smaller element
            while(!st.isEmpty() && (i == n || histo[st.peek()] > histo[i]) ){
                int ht=histo[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
            maxArea = Math.max(maxArea, ht * width);
        }
        st.push(i);//store indeces
    }
    return maxArea;
}
     public static void main(String args[]) {
        int histo[] = {3, 1, 5, 6, 2, 3};
        System.out.println("The largest area in the histogram is " + largestArea(histo));
    }
}
