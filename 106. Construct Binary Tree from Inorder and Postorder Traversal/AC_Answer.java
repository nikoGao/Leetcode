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
    private int postIndex = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        TreeNode root = build(inorder, postorder, 0, inorder.length-1);
        return root;
    }
    
    public TreeNode build(int[] inorder, int[] postorder, int inIndex, int inEnd){
        if(inIndex>inEnd) return null;
        TreeNode root = new TreeNode(postorder[postIndex--]);
        if(inIndex==inEnd) return root;
        int index = search(inorder, root.val, inIndex, inEnd);
        
        root.right = build(inorder, postorder, index+1, inEnd);
        root.left = build(inorder, postorder, inIndex, index-1);
        
        return root;
    }
    
    public int search(int[] inorder, int val, int inIndex, int end){
        int i = 0;
        for(i=inIndex; i<=end; i++){
            if(val==inorder[i]) return i;
        }
        return i;
    }
}
