class Solution {
    public int maxArea(int[] height) {
        int left= 0, right = height.length-1;
        int maxArea = 0;
        while(left<right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])*(right-left));
            if(height[right]<height[left]) right--;
            else left++;
        }
        return maxArea;
    }
}
