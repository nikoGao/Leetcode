class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count_ages = new int[121];
        int[] count_no_more_than = new int[121];
        int result = 0;
        // the condition that ages[A]<100 && ages[B]>100 is redundant
        for(int age:ages) count_ages[age]++;
        for(int age=15; age<121; age++){
            // ages[B] should in the range of (0.5*A+7, A]
            // and when i<=14, 0.5*A+7 will greater than A, so start from 15
            count_no_more_than[age] = count_ages[age] + count_no_more_than[age-1];
            if(count_ages[age]==0) continue; // can not send request
            // all A=age can send requests to these ages no more than 
            result += count_ages[age] * (count_no_more_than[age]-count_no_more_than[age/2+7]-1);
        }
        return result;
    }
}
