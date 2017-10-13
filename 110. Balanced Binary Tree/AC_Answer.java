//if use bfs(from up to bottom) the time complexity is O(N^2)
// if use dfs(bottom to up), calculate each height and verify whether it is a height balanced tree

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
    public int dfsTree(TreeNode node){
        if(node == null) return 0;
        int left = dfsTree(node.left);
        if(left==-1) return -1;
        int right = dfsTree(node.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left, right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return dfsTree(root)!=-1;
    }
}
