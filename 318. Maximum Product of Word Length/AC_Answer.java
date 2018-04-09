class Solution {
    public int maxProduct(String[] words) {
        // Use bit manipulation, change a word into binary string to record the existence of each letter
        if(words.length==0) return 0;
        int[] values = new int[words.length];
        for(int i=0; i<words.length; i++){
            String cur = words[i];
            values[i] = 0;
            for(int j=0; j<cur.length(); j++){
                values[i] |= 1 << (cur.charAt(j) - 'a'); // record occurrence of each letter
            }
        }
        int mul = 0;
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if((values[i] & values[j])==0 && (words[i].length()*words[j].length()>mul)) 
                    mul = words[i].length()*words[j].length();
            }
        }
        return mul;
    }
}
