class Solution {
    public boolean isValidSerialization(String preorder) {
        /*
        One non-null node has two out-child， one inner-child(itself as parent)
        One null node has zero out-child, one inner-child(itself)
        So the diff between outer and inner should always be positive, and at last become zero
        */
        String[] pres = preorder.split(",");
        int diff = 1;
        for(String p:pres){
            --diff;
            if(diff<0) return false;
            if(!p.equals("#")) diff += 2;
        }
        return diff==0;
    }
}
