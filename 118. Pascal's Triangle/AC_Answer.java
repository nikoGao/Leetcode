// O(n^2), use two loop

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new LinkedList<List<Integer>>();
        for(int i = 1; i<= numRows; i++){
            List<Integer> row = new LinkedList<Integer>();
            if (i==1) {
                row.add(1);
                triangle.add(new LinkedList(row));
            }
            else if(i==2){
                row.add(1);
                row.add(1);
                triangle.add(new LinkedList(row));
            }else{
                for(int j = 0; j < i; j++){
                    if (j==0 || j==i-1) row.add(j, 1);
                    else row.add(j, (triangle.get(i-2)).get(j-1)+(triangle.get(i-2)).get(j));
                }
                triangle.add(new LinkedList(row));
            }
        }
        return triangle;
    }
}
