class Solution{
	public int threeSumSmaller(int[] nums, int target){
		List<List<Integer>> result = new ArrayList<>();
		backforward(nums, target, result, new ArrayList<>(), 0);
		return result.size();
	}

	public void backforward(int[] nums, int target, List<List<Integer>> result, List<Integer> c, int index){
		if(c.size()>3 || target<0) return; 
		else if(target>0 && c.size()==3) result.add(new ArrayList<>(c));
		else{
			for(int i=index; i<nums.length; i++){
				c.add(nums[i]);
				backforward(nums, target-nums[i], result, c, i+1);
				c.remove(c.size()-1);
			}
		}
	}
}