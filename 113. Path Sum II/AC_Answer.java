// recursion, pass curList and resList as two params into a function
// add and clear the list while finding

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
    public void pathFound(TreeNode root, List<Integer>store, int sum, List<List<Integer>> res){
        if(root==null) return;
        store.add(new Integer(root.val));
        if(root.left == null && root.right==null && sum==root.val){
            res.add(new LinkedList(store));
            store.remove(store.size()-1);
            return;
        }else{
            pathFound(root.left, store, sum-root.val, res);
            pathFound(root.right, store, sum-root.val, res);
        }
        store.remove(store.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> curres = new LinkedList<Integer>();
        pathFound(root, curres, sum, res);
        return res;
    }
}
