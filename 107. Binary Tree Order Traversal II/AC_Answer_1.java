//Use dfs with a helper to calculate the level
//First build a list for each level, when touch the bottom, start to add elements

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
    public void levelMarker(List<List<Integer>> list, TreeNode root, int level){
        if(root==null) return;
        if(level>=list.size()){
            list.add(0,new LinkedList<Integer>());
        }
        levelMarker(list, root.left, level+1);
        levelMarker(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        levelMarker(res, root, 0);
        return res;
    }
}
