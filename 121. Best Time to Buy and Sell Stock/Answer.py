#设置一个指针指向当前最小值，后向遍历
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        diff = 0
        if prices:
            mini = prices[0]
            for i in range(1, len(prices)):
                if prices[i] - mini < 0:
                    mini = prices[i]
                if prices[i] - mini > diff:
                    diff = prices[i] - mini
        return diff
