//Notify the input is char[], so the whole s is like ['t','h','e', ' ']
//So split into two steps: 1. reverse the whole array
//2. reverse each word
class Solution{
	public void reverseWord(char[] s){
		//reverse the whole array
		reverse(s, 0, s.length()-1);

		//reverse each word by find space
		int start = 0;
		for(int i=0; i<s.length(); i++){
			if(s[i]==' '){
				reverse(s, start, i-1);
				start = i+1;
			}
		}
		//reverse the last word
		reverse(s, start, s.length()-1);
	}
	public void reverse(char[] s, int start, int end){
		while(start<end){
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}
}