class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] nums = new int[10];
        for(int i=0; i<secret.length(); i++){
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if(s==g) bulls++;
            else{
                if(nums[s]<0) cows++; //once been guessed
                if(nums[g]>0) cows++; //exist in the secret
                
                nums[s]++;
                nums[g]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
