class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        if sum(gas) < sum(cost):
            return -1
        else:
            rest = 0
            station = 0
            for i in range(len(gas)):
                rest += gas[i] - cost[i]
                if rest < 0:
                    rest = 0
                    station = i + 1 
        return station
