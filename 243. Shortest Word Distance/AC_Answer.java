public class Solution{
    public int shortestDistance(String[] words, String word1, String word2){
        int index1 = 0, index2 = words.length(), distance = Integer.MAX_VALUE;
	for(int i = 0; i< words.length(); i++){
            if(word[i].equals(word1)) index1 = i;
	    else if(word[i].equals(word2)) index2 = i;
            distance = Math.min(distance, Math.abs(index2-index1));
	} 
        return distance;
    }
}
