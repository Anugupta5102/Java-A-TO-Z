package DSA.Array;

public class BestTimetoBuySellStock {
    public static int maxProfit(int price[]){
        int mini=price[0];
        int Maxprof=0;
        int n=price.length; 
        for(int i=1;i<n;i++){
            int cost=price[i] - mini;
            Maxprof=Math.max(Maxprof, cost);
            mini=Math.min(mini, price[i]);
        }
        return Maxprof;
    }
    public static void main(String[] args) {
        //maximize the profit--->buy(at min) then sell(at max) only once
        //given arr of n days--->arr[i]=price
        //Buy b/w 1st to (i-1)days and sell on ith day
        //Dynamic Programming---->remembering past  

        int price[]={7,1,5,3,6,4};
        int profit=maxProfit(price);
        System.out.println("Maximum profit : " + profit);
    }
    
}
