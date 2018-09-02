class Solution {
    public String optimalDivision(int[] nums) {
        String result = "";
        if(nums.length==0) return result;
        result += nums[0];
        if(nums.length==1) return result;
        if(nums.length==2) return result + "/" + nums[1];
        // the numerator choose the largest one, then, to minize the denominator, X1/(X2...) = X1/X2 * Y
        // so to maximize Y, make it as X3*...XN
        result += "/(";
        for(int i=1; i<nums.length; i++){
            result += nums[i];
            if(i<nums.length-1) result += "/";
        }
        result += ")";
        return result;
    }
}
