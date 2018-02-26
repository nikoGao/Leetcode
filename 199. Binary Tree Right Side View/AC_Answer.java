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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        if(root==null) return res;
        res.add(root.val);
        nodes.offer(root);
        while(!nodes.isEmpty()){
            int size = nodes.size();
            boolean show = true;
            while(size>0){
                TreeNode cur = nodes.poll();
                if(cur.right!=null){
                    if(show){
                        res.add(cur.right.val);
                        show = false;
                    }
                    nodes.offer(cur.right);
                }
                if(cur.left!=null){
                    nodes.offer(cur.left);
                    if(show){
                        res.add(cur.left.val);
                        show = false;
                    }
                }
                size--;
            }
        }
        return res;
    }
}
