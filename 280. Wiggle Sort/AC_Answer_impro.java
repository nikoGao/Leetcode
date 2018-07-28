class Solution{
	public void wiggleSort(int[] nums){
		Arrays.sort(nums);
		for(int i=2; i<nums.length; i+=3){
			int temp = nums[i];
			// swap(i-1, i)
			nums[i] = nums[i-1];
			nums[i-1] = temp;
		}
	}
}