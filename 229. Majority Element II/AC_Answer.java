class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums.length==0) return res;
        int num1 = nums[0], num2 = nums[0], count1 = 0, count2 = 0, len = nums.length;
        for(int n:nums){
            if(n==num1) count1++;
            else if(n==num2) count2++;
            else if(count1==0){
                num1 = n;
                count1 = 1;
            }else if(count2==0){
                num2 = n;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int n:nums){
            if(n==num1) count1++;
            else if(n==num2) count2++;
        }
        if(count1> nums.length/3) res.add(num1);
        if(count2>nums.length/3) res.add(num2);
        return res;
    }
}
