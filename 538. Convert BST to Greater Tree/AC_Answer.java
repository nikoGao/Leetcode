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
    public TreeNode convertBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        findAllNodes(nodes, root);
        List<Integer> temp = new ArrayList<>(nodes);
        for(int i=0; i<nodes.size(); i++){
            int sum = 0;
            for(int j=0; j<nodes.size(); j++){
                if(temp.get(j)>temp.get(i)) sum += temp.get(j);
            }
            nodes.set(i, sum+temp.get(i)); 
        }
        changeNodes(nodes, root);
        return root;
    }
    
    public void findAllNodes(List<Integer> nodes, TreeNode root){
        if(root==null) return;
        nodes.add(root.val);
        findAllNodes(nodes, root.left);
        findAllNodes(nodes, root.right);
    }
    public void changeNodes(List<Integer> nodes, TreeNode root){
        if(root==null) return;
        root.val = nodes.get(0);
        nodes.remove(0);
        changeNodes(nodes, root.left);
        changeNodes(nodes, root.right);
    }
}
