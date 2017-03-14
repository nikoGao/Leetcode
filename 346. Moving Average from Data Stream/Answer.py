class MovingAverage(object):
    def __init__(self, size):
        """
        Initialize your data structure her
        :type size: int
        """
        self.size = size
        self.sum = 0
        self.q = []

    def next(self, val):
        """
        :type val:int
        :rtype: float
        """
        self.q.append(val)
        length = len(self.q)
        if length <= self.size:
            self.sum = sum(self.q)
            return self.sum / length
        else:
            self.sum = sum(self.q[length-self.size:])
            return self.sum/self.size
