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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        // can not use dfs, use bfs instead
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<TreeNode> stack = new LinkedList<>();
        Queue<Integer> levels = new LinkedList<>();
        int min = 0, max = 0;
        if(root==null) return new ArrayList(map.values());
        stack.add(root);
        levels.add(0);
        while(!stack.isEmpty()){
            TreeNode cur = stack.poll();
            int cur_level = levels.poll();
            min = Math.min(cur_level, min);
            max = Math.max(cur_level, max);
            if(!map.containsKey(cur_level)) map.put(cur_level, new ArrayList<>());
            map.get(cur_level).add(cur.val);
                
            if(cur.left!=null){
                stack.offer(cur.left);
                levels.offer(cur_level-1);
            }
                
            if(cur.right!=null){
                stack.offer(cur.right);
                levels.offer(cur_level+1);
            }   
        }
        for(int i=min; i<=max; i++){
            result.add(map.get(i));
        }
        return result;
    }
}
