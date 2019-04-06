/**
 * https://leetcode-cn.com/problems/symmetric-tree/
 * 思路：
 * 1. 根节点 = null，则是对称树
 * 2. 取左右子树，一旦节点不相等（有一方为空，双方值不相等）则不相等。否则相等（值相等，子节点不为空）
 * 
 * TODO: 非递归解法
 */

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode treeNode1,TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2 == null) {
            return true;
        }
        if (treeNode1 == null || treeNode2 == null) {
            return false;
        }
        return (treeNode1.value == treeNode2.value) && isSymmetric(treeNode1.left, treeNode2.right) && isSymmetric(treeNode1.right, treeNode2.left);
    }
}