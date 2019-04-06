/**
 * 
 * https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
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
 * 1. 发现层次遍历，用Queue很好用！！！
 * 2. sum 的使用，此处相加可能超出 int 范围
 * 
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<Double>();
        
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0;
            int size = queue.size();
            int tmp = queue.size();
            
            while (tmp > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                
                sum += node.val;
                tmp--;
            }
            
            list.add(1.0 * sum / size);
        }
        
        return list;
    }
}