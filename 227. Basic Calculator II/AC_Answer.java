class Solution {
    public int calculate(String s) {
        Stack<Integer> operands = new Stack<>();
        int num = 0;
        char sign = '+';
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                num = num*10 + (c-'0');
            }
            if((!Character.isDigit(c) && c!=' ') || i==s.length()-1){
                if(sign=='+') operands.push(num);
                if(sign=='-') operands.push(-num);
                if(sign=='*') operands.push(operands.pop()*num);
                if(sign=='/') operands.push(operands.pop()/num);
                sign = c;
                num=0;
            }
        }
        int res = 0;
        for(int i:operands){
            res += i;
        }
        return res;
    }
}
