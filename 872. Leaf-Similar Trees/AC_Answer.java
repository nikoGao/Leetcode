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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        traverse(root1, list1);
        traverse(root2, list2);
        int i=0;
        if(list1.size() != list2.size()) return false;
        while(i<list1.size()){
            // System.out.println("first: "+ list1.get(i) + " second: "+list2.get(i));
            if(list1.get(i) != list2.get(i)) return false;
            i++;
        }
        return true;
    }
    
    public void traverse(TreeNode root, List<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        traverse(root.left, list);
        traverse(root.right, list);
    }
}
