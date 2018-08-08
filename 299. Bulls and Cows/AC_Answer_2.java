class Solution {
    public String getHint(String secret, String guess) {
        // use array, if occurr in secret, array ++, occurr in guess, array--
        int[] arr = new int[10];
        int cow = 0, bull = 0;
        for(int i=0; i<secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s==g) bull++;
            else{
                if(arr[s-'0']<0) cow++; // current character appearred in guess previously
                if(arr[g-'0']>0) cow++; // current character appearred in secret previously
            }
            arr[s-'0']++;
            arr[g-'0']--;
        }
        return Integer.toString(bull) + "A" + Integer.toString(cow) + "B";
    }
}
