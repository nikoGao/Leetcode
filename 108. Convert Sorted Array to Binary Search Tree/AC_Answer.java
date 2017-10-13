// Use recursion and Array.copyOfRange() to slice array into left and right

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        int start = 0;
        int end = nums.length;
        if(start> end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        if(mid>=start && mid<=end){
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, start, mid));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, end));
        }
        return root;
    }
}
