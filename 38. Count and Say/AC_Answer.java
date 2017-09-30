# Use StringBuilder() to build a string array, better than use string
# Runtime 3ms
class Solution {
    public String countAndSay(int n) {
        String s = "1";
        if (n==1) return s;
        for(int i = 1; i < n; i++){
            s = Count(s);
        }
        return s;
    }
    public String Count(String s){
        StringBuilder str = new StringBuilder();
        char cur = s.charAt(0);
        int count = 1;
        for(int i = 1; i< s.length(); i++){
            if (cur==s.charAt(i)){
                count++;
            }else{
                str.append(count);
                str.append(cur);
                count = 1;
                cur = s.charAt(i);
            }
        }
        str.append(count);
        str.append(cur);
        return str.toString();
    }
}
