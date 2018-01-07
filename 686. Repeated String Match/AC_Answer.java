class Solution {
    public int repeatedStringMatch(String A, String B) {
        int times = 0;
        StringBuilder sb = new StringBuilder();
        while(sb.length()<B.length()){
            sb.append(A);
            times++;
        }
        if(sb.toString().contains(B)) return times;
        else if(sb.append(A).toString().contains(B)) return ++times;
        return -1;
    }
}
