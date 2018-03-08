public int shortestWordDistance(String[] words, String word1, String word2) {
	if(words.length==0 || word1==null || word2==null) return 0;
	int distance = Integer.MAX_VALUE, turn = 0;
	int m=-1, n=-1
	for(int i=0; i<words.length; i++){
		if(word1.equals(words[i]) && (turn==0 || turn==1)){
			m = i;
			if(turn==0 || turn==1) turn = 2;
			if(n!=-1) distance = Math.min(distance, Math.abs(m-n));
		}else if(word2.equals(words[i]) && (turn==0 || turn==2)){
			n = i;
			if(turn==0 || turn==2) turn = 1;
			if(m!=-1) distance = Math.min(distance, Math.abs(m-n));
		}
	}
	return distance;
}