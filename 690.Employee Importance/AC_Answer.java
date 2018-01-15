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
    // int sum = 0;
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee em:employees){
            map.put(em.id, em);
        }
        
        return getOne(map, map.get(id));
    }
    
    public int getOne(Map<Integer, Employee> map,Employee employee){
        int sum = 0;
        sum += employee.importance;
        if(!employee.subordinates.isEmpty()){
            for(int em:employee.subordinates){
                sum += getOne(map, map.get(em));
            }
        }
        return sum;
    }
}
