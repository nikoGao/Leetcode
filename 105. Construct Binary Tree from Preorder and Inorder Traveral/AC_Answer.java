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
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = build(preorder, inorder, 0, inorder.length-1);
        return root;
    }
    public TreeNode build(int[] preorder, int[] inorder, int inIndex, int inEnd){
        if(inIndex > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if(inIndex==inEnd) return root;
        int index = search(inorder, root.val, inIndex, inEnd);
        root.left = build(preorder, inorder, inIndex, index-1);
        root.right = build(preorder, inorder, index+1, inEnd);
        return root;
    }
    
    public int search(int[] inorder, int val, int inIndex, int inEnd){
        int i;
        for(i=inIndex; i<=inEnd; i++){
            if(inorder[i]==val) return i;
        }
        return i;
    }
}
