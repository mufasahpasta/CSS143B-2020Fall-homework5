package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {

        TreeNode<Integer> current = root;
        Stack<TreeNode> hold = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        while (current != null || !hold.isEmpty()) {
            while (current != null) {
                hold.push(current);
                current = current.left;
            }
            current = hold.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}