public class Solution{
	public List<List<Integer>> getFactors(int n) {
		List<List<Integer>> res = new ArrayList<>();
		helper(2, 1, n, res, new ArrayList<Integer>());
		return res;
	}

	public void help(int start, int product, int n, List<List<Integer>> res, List<Integer> c){
		if(start>n || product > n) return;

		if(product==n){
			res.add(new ArrayList<Integer>(c));
			return;
		}

		for(int i=start; i<n; i++){
			if(product*i>n) break;

			if(n%i==0){
				c.add(i);
				help(i+1, product*i, n, res, c);
				c.remove(c.size()-1);
			}
		}
	}
}