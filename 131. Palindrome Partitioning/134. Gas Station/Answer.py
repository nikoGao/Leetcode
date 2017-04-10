# Time Limited Exceed

class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        num = len(gas)
        for i in range(num):
            trunk = gas[i]
            used = cost[i]
            j = i+1
            time = 0
            while time <= num:
                if j == num:
                    j = 0
                if trunk < used:
                    break
                else:
                    trunk += gas[j]
                    used += cost[j]
                j += 1
                time += 1
            if trunk >= used:
                return i
        return -1
