class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>(); // store all these split index can't combine a pair
        if(s.length()==0) return 0;
        int res = 0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                if(stack.isEmpty()) stack.push(i);
                else{
                    int index = stack.peek();
                    if(s.charAt(index)=='(') stack.pop(); // can form a new pair
                    else stack.push(i); // a separator
                }
            }
            i++;
        }
        if(stack.isEmpty()) return s.length();
        int end = s.length();
        while(!stack.isEmpty()){
            int separator = stack.pop();
            res = Math.max(res, end-separator-1);
            end = separator;
        }
        // from the last appear of ) to the start
        res = Math.max(res, end);
        return res;
    }
}
