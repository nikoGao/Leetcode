class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses==0 || prerequisites.length==0) return true;
        
        List<List<Integer>> courses = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            courses.add(new ArrayList<>());
        }
        
        //Create Graph
        for(int i=0; i<prerequisites.length; i++){
            courses.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        boolean[] visited = new boolean[numCourses];
        // Arrays.fill(visited, false);
        
        //Apply dfs to the graph
        for(int i=0; i<numCourses; i++){
            if(!dfs(courses, visited, i)) return false;
        }
        return true;
    }
    
    public boolean dfs(List<List<Integer>> courses, boolean[] visited, int course){
        if(visited[course]) return false;
        else{
            visited[course] = true;
            for(int i=0; i<courses.get(course).size(); i++){
                if(!dfs(courses, visited, courses.get(course).get(i))) return false;
            }
            visited[course] = false;
            return true;
        }
    }
}
