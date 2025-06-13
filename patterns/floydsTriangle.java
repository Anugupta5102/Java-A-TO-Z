package patterns;
//  1
//  2 3  
//  4 5 6
//  7 8 9 10      
//  11 12 13 14 15

public class floydsTriangle {
    public static void main(String[] args) {
        int c=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                c++;
                System.out.print(" "+c);
            }
            System.out.println();
        }
    }
}
