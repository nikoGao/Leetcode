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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root==null) return output;
        int direction = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            while(size>0){
                TreeNode cur = q.poll();
                level.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
                size--;
            }
            if(direction==-1) Collections.reverse(level);
            output.add(level);
            direction = -direction;
        }
        return output;
    }
}
