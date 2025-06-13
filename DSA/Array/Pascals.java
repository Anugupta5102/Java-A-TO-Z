package DSA.Array;
// Each number is the sum of the two numbers directly above it.
// The triangle starts with a single 1 at the top, and each subsequent row contains one more number than the previous row.
// The first few rows of Pascal's Triangle are:
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1
public class Pascals {
//O(N^2)-TC ,  O(N^2)-SC
        public static void main(String[] args) {
            int rows = 5; // Number of rows for Pascal's Triangle
            int[][] pascal = new int[rows][rows];
    
            // Fill the Pascal's Triangle matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    // First and last values in every row are 1
                    if (j == 0 || j == i) {
                        pascal[i][j] = 1;
                    } else {
                        // Other values are sum of values just above and left of above
                        pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    }
                }
            }
    
            // Print the Pascal's Triangle matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(pascal[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    

