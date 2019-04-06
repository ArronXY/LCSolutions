/**
 * https://leetcode-cn.com/problems/binary-tree-paths/
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<>();
        
        if(root == null){            
            return l;
        }
        
        if(root.left == null && root.right == null){
            l.add(root.val+"");
            return l;
        }
        
        List<String> ll = binaryTreePaths(root.left);
        for(String  e : ll){
            l.add(root.val+"->"+e);
        }
        
        List<String> rl = binaryTreePaths(root.right);
        for(String e : rl){
            l.add(root.val+"->"+e);
        }
        
        return l;  
    }
}