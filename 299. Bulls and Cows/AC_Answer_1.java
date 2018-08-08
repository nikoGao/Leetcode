class Solution {
    public String getHint(String secret, String guess) {
        Map<Character, Integer> map = new HashMap<>();
        int cow = 0, bull = 0;
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)) bull++;
            map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0)+1);
        }
        for(int j=0; j<guess.length(); j++){
            char c = guess.charAt(j);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    cow++;
                    map.put(c, map.get(c)-1);
                } 
            }
        }
        return Integer.toString(bull) + "A" + Integer.toString(cow-bull) + "B";
    }
}
