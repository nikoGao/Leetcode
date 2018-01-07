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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        if(root.left==null && root.right==null) return -1;
        int left = root.left.val;
        int right = root.right.val;
        if(root.val==left) left = findSecondMinimumValue(root.left);
        if(root.val==right) right = findSecondMinimumValue(root.right);
        
        if(left!=-1 && right!=-1) return Math.min(left, right);
        else if(left==-1) return right;
        else return left;
        
    }
    
}
