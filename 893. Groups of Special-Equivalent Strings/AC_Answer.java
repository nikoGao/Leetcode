class Solution {
    public int numSpecialEquivGroups(String[] A) {
        // use a way to represent all special-equivalent
        // as can swap multiple times, then just insure all chars appear in certain odd or even positions for certain times
        Set<String> signatures = new HashSet<>();
        // need to form all string with same signatures together, just count its size
        for(String s:A){
            int[] odd = new int[26];
            int[] even = new int[26];
            for(int i=0; i<s.length(); i++){
                if(i%2==0) even[s.charAt(i)-'a']++;
                else odd[s.charAt(i)-'a']++;
            }
            signatures.add(Arrays.toString(odd) + Arrays.toString(even));
        }
        return signatures.size();
    }
}
