i/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public NestedInteger deserialize(String s) {
        if(s.length()==0) return new NestedInteger();
        if(s.charAt(0)!='[') return new NestedInteger(Integer.parseInt(s)); // is a single value
        Stack<NestedInteger> stack = new Stack<>();
        NestedInteger result = null;
        int l=0, r = 0;
        for(; r<s.length(); r++){
            char c = s.charAt(r);
            // will meet three kinds of char: digit, [/], ,
            if(c=='['){
                // means there is another nestedInteger, need to record current one
                if(result != null) stack.push(result);
                result = new NestedInteger();
                l = r+1;
            }else if(c==']'){
                // first check whether there is a num or consecutive ']'
                String num = s.substring(l, r);
                if(!num.isEmpty()) result.add(new NestedInteger(Integer.parseInt(num)));
                // a inner nestedInteger has built, connet it with its outer one
                if(!stack.isEmpty()){
                    NestedInteger prev = stack.pop();
                    prev.add(result);
                    result = prev;
                }
                l = r+1;
            }else if(c==','){
                if(r>0 && s.charAt(r-1)!=']'){
                    // there is a num
                    String num = s.substring(l, r);
                    result.add(new NestedInteger(Integer.parseInt(num)));
                }
                l = r+1;
            }
        }
        return result;
    }
}
