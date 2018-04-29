class Solution {
    public int[] shortestToChar(String S, char C) {
        //two loops, one forward, another one is backward
        // first forward, find C position and label all index distance after found C
        int[] result = new int[S.length()];
        boolean found = false;
        int distance = 0;
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)==C){
                found = true;
                distance = 0;
            }else{
                ++distance;
            }
            if(found) result[i] = distance;
            else result[i] = Integer.MAX_VALUE;
        }
        // then backward, relabel index distance between two C's and those non-label index before first C
        found = false;
        for(int i=S.length()-1; i>=0; i--){
            if(S.charAt(i)==C){
                found = true;
                distance = 0;
            }else{
                ++distance;
            }
            if(found && result[i]>distance) result[i] = distance;
        }
        return result;
    }
}
