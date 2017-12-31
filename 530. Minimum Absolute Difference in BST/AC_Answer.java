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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> nodes = new ArrayList<Integer>();
        getAllNodes(root, nodes);
        Collections.sort(nodes);
        if(nodes.size()==1) return nodes.get(0);
        int diff = Integer.MAX_VALUE;
        for(int i=1; i<nodes.size(); i++){
            int temp = nodes.get(i) - nodes.get(i-1);
            if(temp < diff) diff = temp;
        }
        return diff;
    }
    
    public void getAllNodes(TreeNode root, List<Integer> nodes){
        while(root==null) return;
        nodes.add(root.val);
        getAllNodes(root.left, nodes);
        getAllNodes(root.right, nodes);
    }
}
