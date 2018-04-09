// use dfs

public class Solution{
	public List<String> generateAbbreviations(String word){
		List<String> res = new ArrayList<>();
		res.add(word);
		generateHelper(0, word, res);
		return res;
	}

	public void generateHelper(int start, String word, List<String> result){
		if(start >= word.length()){
			return;
		}
		for(int i=start; i<s.length(); i++){
			for(int j=1; i+j<=s.length(); j++){
				String num = Integer.toString(j);
				String cur = s.substring(0, i) + num + s.substring(i+j);
				result.add(cur);
				generateHelper(i + num.length() + 1, cur, result); // can not have continuous number string
			}
		}
	}
}