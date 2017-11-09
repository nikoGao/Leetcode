class Solution {
    public char findTheDifference(String s, String t) {
        char[] array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(t_array);
        int i = 0;
        for(; i< array.length; i++){
            if(t_array[i]!=array[i]) break;
        }
        return t_array[i];
    }
}
