import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class KthLargestLevelSum {
    public int kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;

        Queue<TreeNode> queue = new LinkedList<>();
        PriorityQueue<Long> minHeap = new PriorityQueue<>(); // Min-heap to store top k sums
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            long levelSum = 0; // Sum of nodes at the current level

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                levelSum += current.val;

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            // Add the current level sum to the heap
            minHeap.offer(levelSum);

            // If the heap size exceeds k, remove the smallest sum
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // If we have fewer than k levels, return -1
        return minHeap.size() == k ? (int) (long) minHeap.poll() : -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);

        KthLargestLevelSum solution = new KthLargestLevelSum();
        int k = 2;
        System.out.println("The " + k + "th largest level sum is: " + solution.kthLargestLevelSum(root, k));
    }
}


