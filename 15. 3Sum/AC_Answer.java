class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int left=0, right=0;
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i]>nums[i-1]){
                left = i+1; right = nums.length-1;
            }
            while(left<right){
                if(nums[left] + nums[right] == -nums[i]){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    left++; right--;
                    while(nums[left]==nums[left-1] && left<right) left++;
                    while(nums[right]==nums[right+1] && right>left) right--;
                }else if(nums[left] + nums[right] < -nums[i]){
                    while(left<right){
                        left++;
                        if(nums[left]>nums[left-1]) break;
                    }
                }else{
                    while(left<right){
                        right--;
                        if(nums[right]<nums[right+1]) break;
                    }
                }
            }
        }
        return result;
    }
}
