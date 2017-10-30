/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Use global variable to record path
class Solution {
    public List<String> res;
    public void binaryTreeHelper(TreeNode root, List<String> res, String cur){
        if(root!=null&& root.left==null && root.right==null){
            cur += root.val;
            res.add(cur);
        }else{
            cur += root.val + "->";
            if(root.left!=null)
                binaryTreeHelper(root.left, res, cur);
            if(root.right!=null)
                binaryTreeHelper(root.right, res, cur);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<String>();
        if (root==null) return res;
        binaryTreeHelper(root, res, "");
        return res;
    }
}
