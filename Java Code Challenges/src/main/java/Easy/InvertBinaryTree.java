package Easy;

import com.sun.source.tree.Tree;

public class InvertBinaryTree {

    /*
    Invert Binary Tree - Takes in a binary tree and inverts it (swap sibling nodes at all levels) -
    Return the inverted binary tree
     */

    //  Not tested in Easy Tests folder ~ try it in Leetcode

    public static TreeNode invertTree(TreeNode root) {
        //  Check if root is null
        if(root == null) {
            return null;
        }
        //  Traverse down the tree to the furthest left and right leaves
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        //  Swap the values of left and right children for each node encountered
        root.right = left;
        root.left = right;

        return root;
    }
    /*
    *
    * Definition for a binary tree node.
    *
    */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
