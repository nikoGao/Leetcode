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
    int dis = Integer.MAX_VALUE, pre = -1;
    public int minDiffInBST(TreeNode root) {
        if(root.left!=null) minDiffInBST(root.left);
            if(pre != -1) dis = Math.min(dis, root.val-pre);
            pre = root.val;
            if(root.right!=null) minDiffInBST(root.right);
            return dis;
    }
    
}
