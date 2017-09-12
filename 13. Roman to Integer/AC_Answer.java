class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        char previous = s.charAt(0) ;
        int len = s.length();
        if (len==1) return map.get(s.charAt(0));
        else{
            for(int i=1; i< len; i++){
                if (map.get(s.charAt(i))<= map.get(previous)) res += map.get(previous);
                else res -= map.get(previous);
                previous = s.charAt(i);
            }
            res += map.get(s.charAt(len-1));
            return res;
        }  
    }
}
