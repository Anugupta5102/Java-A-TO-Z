package patterns;
//      *     
//     * *    
//    * * *   
//   * * * *  
//  * * * * * 
//  * * * * * 
//   * * * *  
//    * * *   
//     * *    
//      *     

public class diamond {
    public static void main(String[] args) {
        int n=5;
        //upper
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        //lower
        for(int i=n;i>=1;i--){
            for(int k=0;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
