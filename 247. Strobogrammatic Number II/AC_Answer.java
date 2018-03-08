public class Solution{
	public List<String> findStrobogrammatic(int n){
		return helper(n, n);
	}

	public List<String> helper(int n, int K){
		List<String> res = new ArrayList<>();
		if(n==1){
			res.add("0");
			res.add("1");
			res.add("8");
		}else if(n==2){
			if(K!=2){
				res.add("00");
			}
			res.add("11");
			res.add("69");
			res.add("96");
			res.add("88");
		}else{
			List<String> next = helper(n-2, K);
			for(String s:next){
				if(k!=n){
					res.add("0" + s + "0");
				}
				res.add("1" + s + "1");
				res.add("6" + s + "9");
				res.add("8" + s + "8");
				res.add("9" + s + "6");
			}
		}
		return res;
	}
}