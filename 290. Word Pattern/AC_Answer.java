// Linearly compare indexed of the pattern and letter
class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map map = new HashMap();
        int len = pattern.length();
        String[] parts = str.split(" ");
        if(len!=parts.length) return false;
        else{
            for(Integer i=0; i< len; i++){
                if(map.put(pattern.charAt(i), i) != map.put(parts[i],i)){
                    map.put(pattern.charAt(i), parts[i]);
                    return false;
            }
            }
            return true;
        }
    }
}
