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
    public TreeNode str2tree(String s) {
        TreeNode root = null;
        if(s.length()==0) return root;
        Stack<TreeNode> stack = new Stack<>();
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(j)=='('){
                if(j>0 && (s.charAt(j-1)!='(' && s.charAt(j-1)!=')')){
                    root = new TreeNode(Integer.parseInt(s.substring(i,j)));
                }
                stack.push(root);
                root = null;
                i = j+1;
            }else if(s.charAt(j)==')' || j==s.length()-1){
                if(j==0 ||(j>0 && s.charAt(j-1)!=')')){
                    if(j==s.length()-1 && s.charAt(j)!=')') root = new TreeNode(Integer.parseInt(s.substring(i, j+1)));
                    else root = new TreeNode(Integer.parseInt(s.substring(i,j)));
                    
                }
                if(!stack.isEmpty()){
                    TreeNode parent = stack.pop();
                    if(parent.left==null) parent.left = root;
                    else parent.right = root;
                    root = parent;
                }
                i = j+1;
            }
            j++;
        }
        return root;
    }
}
