
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if(root==null) return;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeLinkNode prev = null;
            while(size>0){
                if(prev==null){
                    prev = queue.poll();
                    size--;
                    if(prev.left!=null) queue.offer(prev.left);
                    if(prev.right!=null) queue.offer(prev.right);
                }else{
                    TreeLinkNode cur = queue.poll();
                    size--;
                    if(cur.left!=null) queue.offer(cur.left);
                    if(cur.right!=null) queue.offer(cur.right);
                    prev.next = cur;
                    prev = cur;
                }
            }
            prev.next = null;
        }
    }
}

