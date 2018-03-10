class Solution{
	public List<String> findMissingRande(int[] vals, int start, int end){
		List<String> res = new ArrayList<>();
		for(int i=0; i<vals.length; i++){
			if(i==0){
				if(vals[i]-start == 1) res.add(start);
				else if(vals[i]-start>1) res.add(start+ "->" + vals[i]-1);
			}else if(i==vals.length-1){
				if(end-vals[i]==1) res.add(end);
				else if(end-vals[i]>1) res.add((vals[i]+1) + "->" + end);
			}else{
				if (vals[i]-vals[i-1]==2){
					res.add(vals[i]-1);
				}else if(vals[i]-vals[i-1]>2){
					String s = (vals[i-1]+1) + "->" + (vals[i]-1);
					res.add(s);
				}
			}
		}
		return res;

	}
}