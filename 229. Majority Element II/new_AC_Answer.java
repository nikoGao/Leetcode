class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums.length==0) return result;
        int num1 = nums[0], num2 = nums[0], count1 = 0, count2 = 0;
        // this for loop is to find the two elements have the highest frequency appearance
        for(int i:nums){
            if(i==num1) count1++;
            else if(i==num2) count2++;
            else if(count1==0){
                // hit to the lower boundary
                num1 = i;
                count1++;
            }else if(count2==0){
                num2 = i;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        // there may not be two elements appear more than n/3 time, to check it out
        for(int i:nums){
            if(i==num1) count1++;
            else if(i==num2) count2++;
        }
        if(count1>nums.length/3) result.add(num1);
        if(count2>nums.length/3) result.add(num2);
        return result;
    }
}
