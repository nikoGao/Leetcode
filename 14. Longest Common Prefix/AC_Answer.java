class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, new java.util.Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.length() -s2.length();
            }
        });
        String prefix = "";
        if (strs.length == 0) return prefix;
        else if(strs.length == 1) return strs[0];
        else{
            int len = strs[0].length();
            for(int i = 0; i< len;i++){
                for(int j=0; j< strs.length-1;j++){
                    String s1 = strs[j];
                    String s2 = strs[j+1];
                    if (s1.charAt(i) != s2.charAt(i)) return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
