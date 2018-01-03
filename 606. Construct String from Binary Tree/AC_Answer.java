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
    public String tree2str(TreeNode t) {
        if(t==null) return "";
        String output = "" + t.val;
        
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        
        if(t.left==null && t.right==null) return output;
        if(t.right==null) return output + "(" + left + ")";
        if(t.left==null) return output +"()" + "("+ right + ")";
        
        return output + "(" + left +")" + "(" + right + ")";
    }
}
