// Add all even number and all odd-1, then if there exists odd number, result +1

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        int sum=0, odd = 0;
        for(Character c:map.keySet()){
            if(map.get(c)%2==0) sum+=map.get(c);
            else{
                sum += map.get(c)-1;
                odd = 1;
            }
        }
        sum += odd;
        return sum;
    }
}
