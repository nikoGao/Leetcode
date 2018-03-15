//Use DFS, to make sure there is a solution that whatever the second player does, he can not win
public class Solution{
	public boolean canWin(String s){
		char[] input = s.toCharyArray();
		for(int i=0; i<char.length-1; i++){
			if(input[i]=='+' && input[i+1]=='+'){
				input[i] = '-';
				input[i+1] = '-';
				String next = String.valueOf(input);
				boolean nextTurn = canWin(next);
				if(!nextTurn){
					return true;
				}
				input[i] = '+';
				input[i+1] = '+';
			}
		}
		return false;
	}
}