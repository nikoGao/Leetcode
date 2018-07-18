class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int p1=0, p2=0;
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<4) return result;
        int max = nums[nums.length-1];
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i] + 3*max < target) continue;
            if(4 * nums[i]> target) break;
            if(4* nums[i] == target){
                if(i<nums.length && nums[i+3] == nums[i]){
                    result.add(Arrays.asList(nums[i], nums[i], nums[i], nums[i]));
                    break;
                }
            }
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                if(nums[j] + 2*max < target - nums[i]) continue;
                if(3 * nums[j]> target - nums[i]) break;
                if(3 * nums[j] == target - nums[i]){
                    if(i<nums.length && nums[j+2] == nums[j]){
                        result.add(Arrays.asList(nums[i], nums[j], nums[j], nums[j]));
                        break;
                    }
                }
                p1 = j+1;
                p2 = nums.length-1;
                while(p1<p2){
                    if(nums[p1]+nums[p2] == target-nums[i]-nums[j]){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p1]);
                        temp.add(nums[p2]);
                        result.add(temp);
                        p1++;p2--;
                        while(p1<p2 && nums[p1-1] == nums[p1]) p1++;
                        while(p1<p2 && nums[p2+1] == nums[p2]) p2--;
                    }else if(nums[p1]+nums[p2] > target-nums[i]-nums[j]){
                        p2--;
                        while(p1<p2 && nums[p2+1] == nums[p2]) p2--;
                    }else{
                        p1++;
                        while(p1<p2 && nums[p1-1] == nums[p1]) p1++;
                    }
                }
            }
        }
        return result;
    }
}
