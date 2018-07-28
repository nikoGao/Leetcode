class Solution{
	public int shortWordDistance(String[] words, String word1, String word2){
		if(words.length==0 || word1.length()==0 || word2.length==0) return 0;
		int distance = words.length+1;
		int index1 = -1, index2 = -1, i=0;
		while(i<words.length){
			if(words[i].equals(word1) && index1==-1) index1 = i;
			else if(words[i].equals(word2) && index2==-1) index2 = i;
			if(index1 !=-1 && index2 != -1){
				distance = Math.min(Math.abs(index1-index2), distance);
				index1 = -1;
				index2 = -1;
			}
			i++;
		}
		return result;
	}
}