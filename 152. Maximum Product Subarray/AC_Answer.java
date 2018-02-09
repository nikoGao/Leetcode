// Use two var to track the max and min num of prev n nums' product
// need to swap the min and max when meet a negatvie num in case there are even number of negative nums make the min to the max
class Solution {
    public int maxProduct(int[] nums) {
        int r = nums[0];
        
        for(int i=1, imax=r, imin = r; i<nums.length; i++){
            if(nums[i]<0){
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            
            imax = Math.max(nums[i], imax*nums[i]);
            imin = Math.min(nums[i], imin*nums[i]);
            
            r = Math.max(r, imax);
        }
        return r;      
    }
}
