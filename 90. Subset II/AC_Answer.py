# Run Time 78ms, 
#This problem can be solve with adding one iteration in recursion. and append the subsets to the solution list. The time complexity is NP hard, because the number of sub array is factorial related with the size of the array.
class Solution:  
    # @param num, a list of integer  
    # @return a list of lists of integer  
    def bfs(self,valuelist,solution,S,start):  
        if valuelist not in solution and len(valuelist)<=len(S):  
            solution.append(valuelist)  
        for index in range(start,len(S)):  
            valuelist=valuelist+[S[index]]  
            self.bfs(valuelist,solution,S,index+1)  
            valuelist=valuelist[:len(valuelist)-1]  
    def subsetsWithDup(self, S):  
        solution=[]  
        if len(S)==0:  
            return solution  
        S.sort()  
        self.bfs([],solution,S,0)  
        return solution
