package DSA.DP;
/* Given 2D array[day][task], N*3-->find max points earned ar[day][task]
 * same task not performed consecutive days
 */

 //O(n*4*3)-tc  , O(4)-sc
public class NinjaTraining {
    public static int training(int n,int points[][]){
        int prev[]=new int[4]; //0-3 -> max points to store

        //base case-->on day=0 no prev
        prev[0]=Math.max(points[0][1],points[0][2]);
        prev[1]=Math.max(points[0][0],points[0][2]);
        prev[2]=Math.max(points[0][0],points[0][1]);
        prev[3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));

        for(int day=1;day<n;day++){
            int temp[]=new int[4]; //to store max points of curr day
            for(int last=0;last<4;last++){
                temp[last]=0;

                for(int task=0;task<=2;task++){
                    if(task != last){
                        //cal points
                        temp[last]=Math.max(temp[last],points[day][task]+prev[task]);

                    }
                }
            }
                    prev=temp;
                }
                return prev[3];
            }
            public static void main(String args[]) {
                // Define the points for each activity on each day
                int[][] points = {{10, 40, 70},
                                  {20, 50, 80},
                                  {30, 60, 90}};
        
                int n = points.length; // Get the number of days
                System.out.println(training(n, points)); // Calculate and print the maximum points
            }
    
}
