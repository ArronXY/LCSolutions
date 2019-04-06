import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
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
 * 利用队列的特性（先进先出）来做
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> lists = new LinkedList<>();
        
        if (root == null) {
            return lists;
        }

        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while(count > 0) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
                count--;
            }
            lists.addFirst(list);
        }
        return lists;
    }
}