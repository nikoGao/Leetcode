public class Solution{
	public int threeSumSmaller(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		helper(nums, 0, 0, target, res, new ArrayList<>());
		return res.size();
	}

	public void helper(int[] nums, int count, int start, int target, List<List<Integer>> res, List<Integer> c){
		if(target>0 && count==3){
			res.add(new ArrayList<Integer>(c));
			return;
		}
		if(count>3 || target<0) return;
		for(int i=start; i<nums.length; i++){
			c.add(nums[i]);
			helper(nums, count+1, i+1, target-nums[i], res, c);
			c.remove(c.size()-1);
		} 
	}
}