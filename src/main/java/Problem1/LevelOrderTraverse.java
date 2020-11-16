package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // Using a linked list as a data type to represent a queue, because we don't know the exact number of
        // elements that are being added into the queue.
        Queue<TreeNode> hold = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        hold.add(root);

        while (!hold.isEmpty()) {
            int size = hold.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode<Integer> current = hold.remove();
                level.add(current.val);
                if (current.left != null) {
                    hold.add(current.left);
                }
                if (current.right != null) {
                    hold.add(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}