package patterns;
// 1
// 12   
// 123  
// 1234 
// 12345

public class halfNumPyramid {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}