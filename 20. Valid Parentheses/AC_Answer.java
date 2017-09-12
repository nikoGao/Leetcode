class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[',']');
        Stack store = new Stack();
        for(int i=0; i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                store.push(s.charAt(i));
            }else if(!store.empty()){
                char peek = (char)store.peek();
                char cur = s.charAt(i);
                if(map.get(peek) != cur) return false;
                else store.pop();
            }else return false;
        }
        if(!store.empty()) return false;
        else return true;
    }
}
