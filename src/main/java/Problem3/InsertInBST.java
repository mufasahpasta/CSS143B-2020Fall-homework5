package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // I started this late so the tests won't pass, but this is what i got done. hoping for sone partial credit.
        if (root == null) { // If the root doesn't exist, we can't continue so we return nothing
            return;
        }
                if (root.left == null && root.right != null) { // if the left side is empty, we add a value to the left
                    insert(root.left, valToInsert);
                } else if (root.left != null && root.right == null) { // if the right side is empty, we add a value to the right
                    insert(root.right, valToInsert);
                } else if (root.left == null || root.right == null) { // if both sides are empty, the value will always go to the left
                    insert(root.left, valToInsert);
                }
            }
        }



