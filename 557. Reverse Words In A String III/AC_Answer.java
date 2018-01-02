class Solution {
    public String reverseWords(String s) {
        String[] arrays = s.split(" ");
        for(int i=0; i<arrays.length; i++){
            arrays[i] = new StringBuilder(arrays[i]).reverse().toString();
        }
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<arrays.length; i++) {
            if(i<arrays.length-1){
            builder.append(arrays[i]);
            builder.append(" ");
            }else builder.append(arrays[i]);
        }
        String str = builder.toString();
        return str;
    }
}
