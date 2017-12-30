import java.util.Collection;
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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> output = new HashMap<>();
        find(output, root);
        if(output.isEmpty()) return new int[0];
        Collection<Integer> values = output.values();
        int max = Collections.max(values);
        List<Integer> result = new ArrayList<>();
        for(Integer i:output.keySet()){
            if(output.get(i)==max) result.add(i);
        }
        Integer[] final1 =  result.toArray(new Integer[0]);
        return Arrays.stream(final1).mapToInt(Integer::intValue).toArray();
    }
    
    public void find(Map<Integer, Integer> map, TreeNode root){
        if(root==null) return;
        if(map.containsKey(root.val)) map.put(root.val, map.get(root.val)+1);
        else map.put(root.val, 1);
        find(map, root.left);
        find(map, root.right);
    }
}
