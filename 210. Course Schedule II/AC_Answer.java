class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses==0) return new int[0];
        int[] indegree = new int[numCourses], order = new int[numCourses];
        int index = 0;
        for(int i=0; i<prerequisites.length; i++){
            indegree[prerequisites[i][0]]++;
        }
        //find all courses with no indegree, which means it may be a start point
        Queue<Integer> q = new LinkedList<>(); // to use bfs
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                q.offer(i);
                order[index++] = i;
            }
        }
        
        while(!q.isEmpty()){
            int c = q.poll();
            for(int i=0; i<prerequisites.length; i++){
                if(prerequisites[i][1] == c){
                    indegree[prerequisites[i][0]]--;
                    if(indegree[prerequisites[i][0]]==0){
                        order[index++] = prerequisites[i][0];
                        q.offer(prerequisites[i][0]);
                    }
                }
            }
        }
        return (index==numCourses) ? order: new int[0];
    }
    
}
