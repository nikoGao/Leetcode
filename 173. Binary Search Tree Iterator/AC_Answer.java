/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private List<Integer> vals = new ArrayList<>();
    public BSTIterator(TreeNode root) {
        findVals(vals, root);
        Collections.sort(vals);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(vals.size()==0) return false;
        else return true;
    }

    /** @return the next smallest number */
    public int next() {
        int val = vals.get(0);
        vals.remove(0);
        return val;
    }
    
    public void findVals(List<Integer> vals, TreeNode root){
        if(root==null) return;
        else{
            vals.add(root.val);
            findVals(vals, root.left);
            findVals(vals, root.right);
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
