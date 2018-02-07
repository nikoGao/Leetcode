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
    private List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return res;
        preorder(root);
        return res;
    }
    
    public void preorder(TreeNode root){
        if(root==null) return;
        res.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
