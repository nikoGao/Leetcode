// Since it is BST, just compare val of root, p, q, then result should be root, left, right
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return(root.val-p.val)*(root.val-q.val) < 1?root:lowestCommonAncestor(p.val<root.val ? root.left:root.right,p,q);
        
    }
}
