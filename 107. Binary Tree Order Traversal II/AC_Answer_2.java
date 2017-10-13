//When bfs, use Queue<>(a relization based on LinkedList<>)
// use a for-loop to push each elem in a level to the stack, so that it can push these elems in a List at once

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//Use dfs
import java.io.*;
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> nodes = new LinkedList<Integer>();
            for(int i = 0; i< level; i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                nodes.add(queue.poll().val);
            }
            res.add(0,nodes);
        }
        return res;
    }
}
