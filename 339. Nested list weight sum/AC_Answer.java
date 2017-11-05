public class Solution{
	public int depthSum(List<NestedInteger> nestedList){
		return helper(nestedList, 0);
	}

	public int helper(List<NestedInteger> nestedList, int depth){
		if(nestedList==null||nestedList.size()==0) return 0;
		int sum = 0;
		for(NestedInteger list:nestedList){
			if(list.isInteger())
				sum += list.getInteger()*depth;
			else sum += helper(list.getList(), depth++);
		}
		return sum;
	}
}
