package recursion;

import java.util.ArrayList;
import java.util.List;
//[a+b+c]=target, same element can be used any no of times
public class CombinationSumI {

    // Method to find all unique combinations that sum up to the target
    public static void findCombinations(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if the target is zero, add the current combination to the result
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Recursive case
        for (int i = index; i < arr.length; i++) {
            // Skip if the current element exceeds the target
            if (arr[i] > target) {
                continue;
            }

            // Include the current element in the current combination
            current.add(arr[i]);

            // Recur with the updated target and current element included
            findCombinations(arr, target - arr[i], i, current, result);

            // Backtrack to explore other combinations
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7}; // Change this array to use different elements
        int target = 7; // Change this value to set a different target

        List<List<Integer>> result = new ArrayList<>();//empty DS
        findCombinations(arr, target, 0, new ArrayList<>(), result);

        // Print all combinations
        System.out.println("Combinations that sum up to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
