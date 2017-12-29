class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        String use = "";
        ArrayList<String> output = new ArrayList<>();
        for(String s:words){
            String[] word = s.split("");
            if(rows[0].contains(word[0].toUpperCase())) use = rows[0];
            else if(rows[1].contains(word[0].toUpperCase())) use = rows[1];
            else if(rows[2].contains(word[0].toUpperCase())) use = rows[2];
            else continue;
            boolean flag = true;
            for(String w:word){
                flag &= use.contains(w.toUpperCase());
                // if(!use.contains(w.toUpperCase())) ;
            }
            if(flag)
                output.add(s);
        }
        return output.toArray(new String[output.size()]);
    }
}
