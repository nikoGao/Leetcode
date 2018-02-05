class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        split(s, res, new ArrayList<>());
        return res;
    }
    
    public void split(String s, List<List<String>> res, List<String> c){
        if(s.length()==0){
            // c.add(s);
            res.add(new ArrayList<String>(c));
            // c.remove(s);
            return;
        }else{
            for(int i=1; i<=s.length(); i++){
                String sub = s.substring(0, i);
                if(isPalindrome(sub)){
                    c.add(sub);
                    split(s.substring(i, s.length()), res, c);
                    c.remove(c.size()-1);
                }
            }
        }
    }
    
    public boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
}
