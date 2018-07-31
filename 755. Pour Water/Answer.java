class Solution{
	public int[] pourWater(int[] heights, int V, int k){
		for(int i=0; i<V; i++){
			int l = k, r=k;
			// find the first index on the left smaller than k
			for(int i=k-1; i>=0; i--){
				if(heights[i]<heights[k]){
					l = i;
					break;
				}else if(heights[i]>heights[k]) break; // as there is a higher one like a wall we can not cross
			}
			// find the first index on the right smaller than k
			for(int i=k+1; i<heights.length; i++){
				if(heights[i]<heights[k]){
					r = i;
					break;
				}else if(heights[i]>heights[k]) break; // as there is a higher one like a wall we can not cross
			}
			if(heights[l]<heights[k]) heights[l]++;
			else heights[r]++; // if all left index is higher or equal to current index
		}
		return heights;
	}
}