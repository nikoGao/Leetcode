public class WordDistance{
	Map<String, List<Integer> map;
	public WordDistance(String[] words){
		map = new HashMap<>();
		for(int i=0; i<words.length; i++){
			if(!map.containsKey(words[i])){
				map.put(words[i], new ArrayList<>());
			}
			map.get(words[i]).add(i);
		}
	}
	public int shortest(String word1, String word2){
		ArrayList<Integer> l1 = map.get(word1);
		ArrayList<Integer> l2 = map.get(word2);
		int i=0, j=0, distance = Integer.MAX_VALUE;
		while(i<l1.size() && j < l2.size()){
			distance = Math.min(distance, Math.abs(l1.get(i)-l2.get(j)));
			if(l1.get(i)<l2.get(j)) i++;
			else if(l2.get(j)<l1.get(i)) j++;
		}
		return distance;
	}
}
