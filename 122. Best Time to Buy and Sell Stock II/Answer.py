#因为可以无数次买入，所以只要是递增的就可以累加
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        profit = 0
        if prices:
            for i in range(1, len(prices)):
                if prices[i] - prices[i-1] > 0:
                    profit += prices[i] - prices[i-1]
        return profit
