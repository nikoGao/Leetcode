/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Previous Solution meet the needs of average O(1) time, but use O(2^h) memory
// because of the use of dfs
// To meet the needs of O(h) memory, needs to use another solution, the combination of dfs & bfs, only store current smallest h elements
// Once an element is poped, to check all elements on its rigth( if has one)



public class BSTIterator {

    private Stack<TreeNode> nodes;
    public BSTIterator(TreeNode root) {
        nodes = new Stack<>();
        bfs(root, nodes);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !nodes.empty();
        
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode cur = nodes.pop();
        bfs(cur.right, nodes);
        return cur.val;
    }
    
    public void bfs(TreeNode root, Stack<TreeNode> nodes){
        for(;root!=null;root=root.left) nodes.push(root);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
