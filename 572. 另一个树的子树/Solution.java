/**
 * https://leetcode-cn.com/problems/subtree-of-another-tree/
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
    
    TreeNode it;
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        it = t;
        return subTree(s,t);
    }
    
    private boolean subTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.val == t.val) {
            return (subTree(s.left, t.left) && subTree(s.right, t.right)) || subTree(s.left, t) || subTree(s.right, t);
        } else {
            return subTree(s.left, it) || subTree(s.right, it);
        }
    }
}