/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * 思路：
 * 1. 如果根节点为空 || 只有一个根节点，返回即可
 * 2. 否则递归翻转左右子树
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }

        TreeNode node = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = node;

        return node;
    }
}