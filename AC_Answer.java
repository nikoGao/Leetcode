public class Solution{
	public List<List<String>> groupStrings(String[] strings) {
		Map<String, List<String>> map = new HashMap<>();
		for(String s : strings){
			String index = coded(s);
			if(!map.containsKey(index)){
				map.put(index, new ArrayList<String>);
			}
			map.get(index).add(s);
		}
		List<List<String>> res = new ArrayList<>();
		for(String l:map.keySet()){
			res.add(map.get(l));
		}
		return res;
	}

	public String coded(String s){
		String result = "";
		for(int i=0; i<s.length()-1; i++){
			int temp = (result.get(i) - result.get(i+1) + 26) % 26;
			result += (char)temp;
		}
		return result;
	}
}