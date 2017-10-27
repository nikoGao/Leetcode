class MyStack {
    List<Integer> stack;
    /** Initialize your data structure here. */
    public MyStack() {
        stack = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        stack.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int last;
        last = stack.remove(stack.size()-1);
        return last;
    }
    
    /** Get the top element. */
    public int top() {
        int size = stack.size();
        return stack.get(size-1);
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(stack.size()==0){
            return true;
        }else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
