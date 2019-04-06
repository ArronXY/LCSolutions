import java.util.Enumeration;

import javax.swing.tree.TreeNode;

/**
 * https://leetcode-cn.com/problems/merge-two-binary-trees/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null && t2 != null) return t2;
        if (t2 == null && t1 != null) return t1;

        TreeNode treeNode = new TreeNode(0);
        treeNode.val = t1.val + t2.val;
        treeNode.left = mergeTrees(t1.left,t2.left);
        treeNode.right = mergeTrees(t1.right,t2.right);
        
        return treeNode;
    }
}