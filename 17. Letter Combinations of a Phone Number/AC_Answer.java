class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character, String> phone = new HashMap<>();
        phone.put('2',"abc"); phone.put('3', "def"); phone.put('4', "ghi"); 
        phone.put('5', "jkl"); phone.put('6', "mno"); phone.put('7', "pqrs");
        phone.put('8', "tuv"); phone.put('9', "wxyz");
        if(digits.length()==0) return result;
        find(result, phone, digits, "");
        return result;
    }
    
    public void find(List<String> result, Map<Character, String> phone, String digits, String res){
        if(digits.length()==0){
            result.add(res);
            return;
        }
        else{
            String cur = phone.get(digits.charAt(0));
            int i = 0;
            while(i<cur.length()){
                find(result, phone, digits.substring(1, digits.length()), res+cur.charAt(i));
                i++;
            }
        }
    }
}
