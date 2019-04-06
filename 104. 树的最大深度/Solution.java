/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
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
 * 每一个节点的深度都是左右子节点深度中的最大值
 * 深度值计算逻辑为空的时候0，否则加1
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftMaxDepth = maxDepth(root.left) + 1;
        int rightMaxDepth = maxDepth(root.right) + 1;

        return Math.max(leftMaxDepth, rightMaxDepth);
    }
}