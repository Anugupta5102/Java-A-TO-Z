package DSA.Array;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 4, 8, 2, 3, 7, 8};
        findAndPrintDuplicates(array);
    }

    public static void findAndPrintDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Iterate through the array
        for (int num : array) {
            // If the number is already in 'seen', it's a duplicate
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num); // Add the number to 'seen' if it's not already there
            }
        }

        // Print duplicates
        System.out.println("Duplicates: " + duplicates);
    }
}
