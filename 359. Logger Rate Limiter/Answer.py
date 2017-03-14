class Logger(object):
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.dp = {}
    
    def shouldPrintMessage(self, timestamp, message):
        """
        :type timestamp: int
        :type message: str
        :rtype: bool
        """
        if message not in self.dp:
            self.dp[message] = timestamp
            return True
        if timestamp < self.dp[message] + 10:
            return False
        else:
            self.dp[message] = timestamp
            return True
