import java.util.Scanner;
// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********
public class Hourglass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hourglass pattern: ");
        int n = scanner.nextInt();

        // Upper part of the hourglass -reversed pyramid
        for (int i = n; i > 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the hourglass - pyramid
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
