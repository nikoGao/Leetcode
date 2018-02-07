class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==0 && cost.length>0) return -1;
        for(int i=0; i<gas.length; i++){
            if(success(gas, cost, i)==1) return i;
        }
        return -1;
    }
    
    public int success(int[] gas, int[] cost, int index){
        int tank = gas[index];
        int i=index+1, j=index, times = 0;
        while(times<gas.length){
            if(j==cost.length) j = 0;
            tank -= cost[j++];
            if(tank<0) return -1;
            if(i==gas.length) i=0; 
            tank += gas[i++];
            times++;
        }
        return 1;
    }
}
