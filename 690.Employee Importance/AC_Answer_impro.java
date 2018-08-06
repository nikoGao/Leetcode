// DFS is faster than BFS, so this one is a slower one
/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employers = new HashMap<>();
        for(Employee e:employees) employers.put(e.id, e);
        Queue<Employee> q = new LinkedList<>();
        q.offer(employers.get(id));
        int result = 0;
        while(q.size()>0){
            Employee e = q.poll();
            result += e.importance;
            for(int i:e.subordinates){
                q.offer(employers.get(i));
            }
        }
        return result;
    }
}
