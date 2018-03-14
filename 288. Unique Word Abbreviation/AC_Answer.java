public class ValidWord{
	private Map<String, Set<String>> map;
	public ValidWord(String[] dictionary){
		map = new HashMap<>();
		for(String s:dictionary){
			String store;
			if(s.length()<=2) store = s;
			else store = s.substring(0, 1) + s.substring(1, s.length()-1).length() + s.substring(s.length()-1);
			if(!map.containsKey(store)) map.put(store, new HashSet<>());
			map.get(store).add(s);
		}
	}

	public boolean isUnique(String word){
		String encode;
		if(word.length()<=2) encode = word;
		else encode = word.substring(0, 1) + word.substring(1, s.length()-1).length() + word.substring(s.length()-1);
		if(!map.containsKey(encode)) return true;
		else{
			Set<String> temp = map.get(encode);
			if(temp.contains(word) && temp.size()==1) return true;
		}
		return false;
	}
}