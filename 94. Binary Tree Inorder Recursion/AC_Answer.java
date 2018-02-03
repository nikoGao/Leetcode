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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(res, root);
        return res;
    }
    public void inOrder(List<Integer> res, TreeNode root){
        if(root==null) return;
        inOrder(res, root.left);
        res.add(root.val);
        inOrder(res, root.right);
    }
}
