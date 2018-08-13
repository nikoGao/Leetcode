class Solution {
    public int kEmptySlots(int[] flowers, int k) {
        Set<Integer> blooming = new HashSet<>();
        int N = flowers.length;
        blooming.add(flowers[0]);
        for(int i=1; i<flowers.length; i++){
            int left = flowers[i]-k-1;
            int right = flowers[i] + k + 1;
            if(left>=1 && blooming.contains(left) &&check(left, k, blooming, true)) return i+1;
            if(right<=N && blooming.contains(right) && check(right, k, blooming, false)) return i+1;
            blooming.add(flowers[i]);
        }
        return -1;
    }
    
    public boolean check(int index, int k, Set<Integer> bloom, boolean left){
        int start = index+1, end = index+k+1;
        if(!left){
            start = index-k;
            end = index;
        }
        for(int i=start; i<end; i++){
            if(bloom.contains(i)) return false;
        }
        return true;
    }
}
