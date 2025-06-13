package patterns;
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
public class butterfly {
    public static void main(String[] args) {
    int n=4;
    //upper half
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        for(int k=1;k<=2*(n-i);k++){//spaces
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
       
        System.out.println();

    }
    //lower
    for(int i=n;i>=0;i--){
        for(int j=i;j>=0;j--){
            System.out.print("*");
        }
        for(int k=2*(n-i);k>=1;k--){
            System.out.print(" ");
        }
        for(int j=i;j>=0;j--){
            System.out.print("*");
        }
        
        System.out.println();

    }
    }
}
