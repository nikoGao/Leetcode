class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c=='+' || c=='-' || c=='*'){
                String left = input.substring(0, i);
                String right = input.substring(i+1, input.length());
                List<Integer> lList = diffWaysToCompute(left);
                List<Integer> rList = diffWaysToCompute(right);
                for(Integer l: lList){
                    for(Integer r: rList){
                        int output = 0;
                        switch(c){
                            case '+': output += (l+r);
                                break;
                            case '-': output += (l-r);
                                break;
                            case '*': output += (l*r);
                                break;
                        }
                        res.add(output);
                    }  
                }
            }
        }
        if(res.size()==0) res.add(Integer.parseInt(input));
        return res;
    }
}
