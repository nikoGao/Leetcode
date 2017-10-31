//only need to check the times a number appear is odd or even
public class Solution{
	public boolean isPalindrome(String s){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0 ; i< s.length(); i++){
			if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
			else map.put(s.charAt(i), map.get(s.charAt(i))++);
		}
		int count = 0;
		for(Character key: map.keySet()){
			count += map.get(key) % 2;
		}
		return count<=1;
	}
}