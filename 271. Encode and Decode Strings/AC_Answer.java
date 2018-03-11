public class Solution{
	public String encode(List<String> strs) {
		if(strs.size()==0) return "";
		StringBuilder sb = new StringBuilder();
		for(String s:strs){
			if(s.length()==0) sb.append("0#");
			else{
				sb.append(s.length() + "#" + s);
			}
		}
		return sb.toString();
	}

	public List<String> decode(String s){
		List<String> res = new ArrayList<>();
		if(s.length()==0) return res;
		int i=0;
		while(i<s.length()){
			int j = i;
			while(j<s.length() && Character.isDigit(s.charAt(j))){
				j++;
			}

			int num = Integer.parseInt(s.substring(i, j));
			i = j;
			i++;
			if(num==0) res.add("");
			else res.add(s.substring(i, i+num));
			i += num;
		}
		return res;
	}
}