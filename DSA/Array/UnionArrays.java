package DSA.Array;
import java.util.Arrays;
/* TC-O(nlogn + mlogm)     SC-O(1) */
public class UnionArrays {

    // Method to print the union of two sorted arrays
    public static void printUnion(int a1[], int a2[]) {
        int n = a1.length;
        int m = a2.length;
        int i = 0, j = 0;

        // Sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        while (i < n && j < m) {
            // If the current element of a1 is smaller, add it to the union and move i
            if (a1[i] < a2[j]) {
                System.out.print(a1[i] + " ");
                i++;
            }
            // If the current element of a2 is smaller, add it to the union and move j
            else if (a2[j] < a1[i]) {
                System.out.print(a2[j] + " ");
                j++;
            }
            // If elements are equal, add any one of them to the union and move both pointers
            else {
                System.out.print(a1[i] + " ");
                i++;
                j++;
            }
        }

        // Print remaining elements of a1
        while (i < n) {
            System.out.print(a1[i] + " ");
            i++;
        }

        // Print remaining elements of a2
        while (j < m) {
            System.out.print(a2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int a1[] = {7, 3, 9};
        int a2[] = {6, 2, 9, 7, 3, 4, 9};
        printUnion(a1, a2);
    }
}