class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length-1, leftmax = 0, rightmax = 0, volume = 0;
        while(left<=right){
            leftmax = Math.max(height[left], leftmax); // find the heighest for current left
            rightmax = Math.max(height[right], rightmax); // find the heighest for current right
            if(leftmax < rightmax){
                // which means, left is lower, then can store leftmax - heigth[left] water
                volume += (leftmax - height[left]);
                left++;
            }else{
                volume += (rightmax - height[right]);
                right--;
            }
        }
        return volume;
    }
}
