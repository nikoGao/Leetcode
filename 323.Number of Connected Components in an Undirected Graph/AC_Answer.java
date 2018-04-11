public class Solution{
	public int countComponents(int n, int[][] edges){
		int res = n;
		int[] out = new int[n];
		for(int i=0; i<n; ++i) out[i] = i; //assume all node are in different component
		for(int[] e:edges){
			int x =find(out, e[0]), y=find(out, e[1]);
			if(x != y){  // if they are in same component
				--res;
				out[y] = x;
			}
		}
		return res;
	}
	public int find(int[] component, int i){
		while(component[i] != i) i = component[i];
		return i;
	}
}