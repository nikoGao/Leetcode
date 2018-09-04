class Solution {
    public boolean checkValidString(String s) {
        return check(s, 0, 0);
    }
    
    public boolean check(String s, int start, int num){
        if(num<0) return false;
        
        for(int i=start; i<s.length(); i++){
            if(s.charAt(i)=='(') num++;
            else if(s.charAt(i)==')') num--;
            else{
                // if *==(, num++, else if *==empty num not change; else num--
                return check(s, i+1, num+1) || check(s, i+1, num-1) || check(s, i+1, num);
            }
            if(num<0) return false;
        }
        return num==0;
    }
}
