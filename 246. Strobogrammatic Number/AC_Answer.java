// Use extra storage
public class Solution{
    public boolean isStrobogrammatic(String num){
        Map<Character, Character> map = new HashMap<Character, Character>();
	map.put('0','0');
	map.put('1','1');
	map.put('8','8');
	map.put('6','9');
	map.put('9','6');
	int len = num.length();
	for(int i = 0; i<len/2+1; i++){
	    if(!map.containsKey(num.charAt(i))) return false;
	    else{
	        if(num.charAt(len-i-1)!=map.get(num.charAt(i))) return false;
	    }
	}
	return ture;
    }
}
