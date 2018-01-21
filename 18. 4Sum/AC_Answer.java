class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<4) return res;
        for(int i=0; i<nums.length-3; i++){
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break; //first candidate too large, search finished
            if(nums[i]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)continue; //first candidate too small
            if(i>0&&nums[i]==nums[i-1])continue;
            Set<List<Integer>> set = threeSum(nums, target-nums[i], i);
            for(List<Integer> j:set){
                j.add(0,nums[i]);
                res.add(j);
            }
        }
        return res;
    }
    
    public Set<List<Integer>> threeSum(int[] nums, int target, int index){
        Set<List<Integer>> output = new HashSet<>();
        int left=0, right = 0;
        for(int i=index+1; i<nums.length-2; i++){
            if(i==index+1 || nums[i]>nums[i-1]){
                left = i+1; right = nums.length-1;
            }
            while(left<right){
                int value = nums[i] + nums[left] + nums[right];
                if(value==target){
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[left]);
                    pair.add(nums[right]);
                    output.add(pair);
                    left++; right--;
                    while(nums[left-1] == nums[left] && left<right) left++;
                    while(nums[right+1] == nums[right] && left<right) right--;
                }
                else if(value<target) left++;
                else right--;
            }
        }
        return output;
    }
}
