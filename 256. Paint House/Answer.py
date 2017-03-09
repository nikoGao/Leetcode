#Dynamic design question
#To make the cost of painting i houses min, we need to make cost os painting i-1 min. Then paint ith's color depend on (i-1)th color and its cost
#use a matrix to record the cost of previous i-1 houses
#need to initial
class Solution(object):
    def minCost(self, costs):
        """
        :type costs: List[List[int]]
        :rtype: int
        """
        if len(costs) == 0:
            return 0
        cost = [[0 for i in range(3)] for i in range(len(costs)]
        cost[0][0] = costs[0][0]
        cost[0][1] = costs[0][1]
        cost[0][2] = costs[0][2]
        i = 1
        while i < len(costs):
            cost[i][0] = min(cost[i-1][1], cost[i-1][2]) + costs[i][0]
            cost[i][1] = min(cost[i-1][0], cost[i-1][2]) + costs[i][1]
            cost[i][2] = min(cost[i-1][0], cost[i-1][1]) + costs[i][2]
            i += 1
        return min(cost[i][0], min(cost[i][1], cost[i][2]))
