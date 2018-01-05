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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        findValues(list, root);
        for(Integer i:list){
            if(list.contains(k-i) && k-i!=i) return true;
        }
        return false;
    }
    
    public void findValues(List<Integer> list, TreeNode root){
        if(root==null) return;
        list.add(root.val);
        findValues(list, root.left);
        findValues(list, root.right);
    }
}
