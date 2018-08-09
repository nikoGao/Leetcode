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
    
    private int max;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        max = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        dfs(root, frequency);
        List<Integer> nodes = new ArrayList<>();
        for(int key:frequency.keySet()){
            if(frequency.get(key)==max) nodes.add(key);
        }
        int[] result = new int[nodes.size()];
        for(int i=0; i<result.length;i++) result[i] = nodes.get(i);
        return result;
    }
    
    public int dfs(TreeNode root, Map<Integer, Integer> freq){
        if(root==null) return 0;
        int left = dfs(root.left, freq);
        int right = dfs(root.right, freq);
        int subsum = root.val + left + right;
        freq.put(subsum, freq.getOrDefault(subsum, 0)+1);
        max = Math.max(freq.get(subsum), max);
        return subsum;
    }
}
