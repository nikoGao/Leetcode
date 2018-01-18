class Solution{
	String boldWords(String[] words, String S) {
		if(words.length==0||s.length()==0) return "";
		boolean[] marks = new boolean[S.length()];

		for(String word:words){
			for(int i=0; i<S.length()-word.length(); i++){
				String sub = S.substring(i, i+word.length());
				if(sub.equals(word)){
					Arrays.fill(boolean, i, i+word.length(), true);
				}else Arrays.fill(boolean, i, i+word.length(), false);
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<S.length(); i++){
			if(marks[i] && (i==0||!marks[i-1])) sb.append("<b>");
			else if(marks[i] && (i==S.length-1||!marks[i+1])) sb.append("<\b>");
			else sb.append(S.charAt(i));
		}
		return sb.toString();
	}
}