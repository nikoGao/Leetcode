/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int diff = 0;
    public int findTilt(TreeNode root) {
        sumSubtree(root);
        return diff;
    }
    
    public int sumSubtree(TreeNode root){
        if(root==null) return 0;
        
        int left = sumSubtree(root.left);
        int right = sumSubtree(root.right);
        
        diff += Math.abs(left-right);
        return left + right + root.val;
        
    }
}
