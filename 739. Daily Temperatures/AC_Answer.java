class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int top = -1;
        int[] result = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(top>-1 && temperatures[i]>temperatures[stack[top]]){
                int prev = stack[top--]; // means pop that elements
                result[prev] = i-prev;
            }
            stack[++top] = i;
        }
        return result;
    }
}
