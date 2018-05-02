class Solution{

	public int findMaxSubArraySumEqualsk(int[] nums, int k){
		int sum = 0, max = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			sum += nums[i];
			if(sum==k){
				max = Math.max(max, i+1);
			}
			int diff = sum - k; //to tract subarray in middle of the array, if diff has existed, means array[current index]-array[previous existed index] = k
			if(!map.containsKey(diff)) map.put(diff, i);
			else max = Math.max(max, i - map.get(diff));
		}
		return max;
	}
}