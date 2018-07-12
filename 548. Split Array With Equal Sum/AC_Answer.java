class Solution{
	public boolean splitArray(int[] nums){
		// as i,j,k split array into four part not included itself, there should be at least 7 elements
		if(nums.length<7) return false; 
		int[] sums = new int[nums.length];
		sums[0] = nums[0];
		for(int i=1; i<nums.length; i++){
			sums[i] = sum[i-1] + nums[i];
		}
		for(int j=3; j<nums.length-3; j++){
			List<Integer> potential = new ArrayList<>();
			for(int i=1; i<j-1; i++){
				if(sums[i-1] == (sums[j-1]-sums[i])) potential.add(sums[i-1]);
			}
			for(int k=j+1; k<nums.length-1; k++){
				int sums3 = sums[k-1] - sums[j];
				int sums4 = sums[nums.length-1] - sums[k];
				if(sums3==sums4 && potential.contains(sums3)) return true;
			}
		}
		return false;
	}
}