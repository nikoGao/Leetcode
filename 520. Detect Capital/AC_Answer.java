class Solution {
    public boolean detectCapitalUse(String word) {
        if(word=="") return false;
        if(Character.isUpperCase(word.charAt(0))){
            boolean flag = true;
            if(word.length()>1){
                if(Character.isUpperCase(word.charAt(1))){
                    for(int i=2; i<word.length(); i++){
                        flag &= Character.isUpperCase(word.charAt(i));
                    }
                }else{
                    for(int i=2; i<word.length(); i++){
                        flag &= Character.isLowerCase(word.charAt(i));
                    }
                }
            }
            return flag;
        }else{
            boolean flag = true;
            for(int i=1; i<word.length();i++){
                flag &= Character.isLowerCase(word.charAt(i));
            }
            return flag;
        }
    }
}
