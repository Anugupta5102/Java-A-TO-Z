package patterns;
//      1    
//     212   
//    32123  
//   4321234 
//  543212345
public class palindromic {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //print increasing no
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //print decreasing no
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
