public class Solution{
	public int findCelebrity(int n){
		int res = 0;
		for(int i=0; i<n; ++i){
			if(knows(res, i)) res = i;
		}
		for(int i=0; i<n; i++){
			if(res !=i && knows(res, i) || (!know(i, res))) return -1;
		}
		return res;
	}
}