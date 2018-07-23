class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()) return false;
        if(A.length()<2 || B.length()<2) return false;
        int start = -1, end = -1, swap = 0;
        int[] alpha1 = new int[26];
        for(int i=0; i<A.length(); i++){
            alpha1[A.charAt(i)-'a']++;
            if(A.charAt(i) != B.charAt(i)){
                if(start==-1) start = i;
                else if(end == -1){
                    end = i;
                    if(A.charAt(start)!=B.charAt(end) || A.charAt(end)!=B.charAt(start)) return false;
                    else{
                        swap++;
                        start=-1;
                        end = -1;
                    }
                }
            }
        }
        // a==b, if a letter exists odd time, then swap is not realizable
        if(swap==0){
            int odd = 0;
            for(int i=0; i<26; i++){
                if(alpha1[i] % 2==1) odd++;
            }
            return odd==0;
        }else return swap==1;
    }
}
