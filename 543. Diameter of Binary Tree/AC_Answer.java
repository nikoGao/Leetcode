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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        mostDiameter(root);
        return max;
    }
    public int mostDiameter(TreeNode root){
        if(root==null) return 0;
        
        int left = mostDiameter(root.left);
        int right = mostDiameter(root.right);
        
        max = Math.max(max, left+right);
        
        return Math.max(left, right) + 1;
    }
}
