class Solution{
	public List<String> findMissingRanges(int[] vals, int start, int end) {
		List<String> result = new ArrayList<>();
		if(vals.length==0) return result;
		start -= 1; // start from -1, so that when time to change to String, all start need to add 1
		for(int v:vals){
			if(v-start<2) start++;
			else{
				toString(start+1, v-1, result);
				start = v;
			}
		}
		if(start!=end) toString(start+1, end);
		return result;
	}

	public void toString(int start, int end, List<String> result){
		if(start==end) result.add(String.valueOf(start));
		result.add(start + "->" + end);
	}
}
