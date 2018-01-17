class Solution{
	public boolean areSentencesSimilar(String[] a, String[] b, String[][] pairs){
		if(a.length()!=b.length()) return false;
		Map<String, Set<String>> map = new HashMap<>();
		for(String[] pair:pairs){
			if(!map.containsKey(pair[0])) map.put(pair[0], new HashSet<>());
			map.get(pair[0]).add(pair[1]);
		}
		for(int i=0; i<a.length; i++){
			if(a[i]!=b[i] && !map.getOrDefault(a[i]).contains(b[i]) && !map.getOrDefault(b[i]).contains(a[i])) 
				return false;
		}
		return true;
	}
}