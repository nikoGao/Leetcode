class Solution{
	public int findCelebrity(int n){
		int res = 0; // candidate of celebrity
		// try to find a candidate who knows no one
		for(int i=1; i<n; i++){
			if(knows(res, i)) res = i;
		}
		// check if this candidate is a celebrity
		for(int i=0; i<n; i++){
			if(i!=res && (knows(res, i) || !knows(i, res))) return -1;
		}
		return res;
	}
}