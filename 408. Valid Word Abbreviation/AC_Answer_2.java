class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        int count = 0;
        while(j<abbr.length()){
            char c = abbr.charAt(j);
            if(count==0 && c=='0') return false; // digit can not start with zero
            if(count+i>=word.length()) return false; // the abbreviation digit exceed word's length
            if(Character.isLetter(c)){
                // abbr meets a letter char, compare
                if(count>0){
                    i += count;
                    count = 0;
                }
                if(word.charAt(i) != c) return false;
                i++;
            }else if(Character.isDigit(c)) count = count * 10 + (c-'0');
            j++;
        }
        return i+count==word.length();
    }
}
