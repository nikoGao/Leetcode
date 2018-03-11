public class Solution{

	public List<String> generatePalindromes(String s) {
		List<String> res = new ArrayList<>();
		if(s.length==0) return res;
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++){
			if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 0);
			else map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		String single = "";
		String candidate = "";
		boolean already = false;
		for(Character c:d.keySet()){
			int num = map.get(c)/2;
			for(int i=0; i<num; i++){
				candidate += c;
			}
			if(map.get(c)%2 != 0){
				if(already) return res;
				else{
					already = true;
					single += c;
				}
			}
		}
		if(candidate.length()==0 && single.length() !=0){
			res.add(single);
			return res;
		}

		helper("", candidate, single, candidate.length(), res);
		return res;
	}

	public void helper(String left, String candidate, String single, int len, List<String> res){
		if(left.length()==len){
			String right = new StringBuilder(left).reverse().toString();
			res.add(left + single + right);
		}
		for(int i = 0; i < candidate.length(); i++) {
            if(i > 0 && candidate.charAt(i) == candidate.charAt(i - 1))
                continue;
            recursion(left + candidate.charAt(i), candidate.substring(0, i) + candidate.substring(i + 1), single, l, results);
	}
}