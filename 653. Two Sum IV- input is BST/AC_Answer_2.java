//Use HashSet to record all nodes and check if hashset contains(k-node.val)
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
        Set<Integer> set = new HashSet<>();
        return findValues(set, root, k);
    }
    
    public boolean findValues(Set<Integer> set, TreeNode root, int k){
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        set.add(root.val);
        return findValues(set, root.left, k) || findValues(set, root.right, k);
    }
}
