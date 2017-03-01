#Time Limited Exceed
class MinStack(object):

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.list1 = []

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        self.list1.insert(0, x)

    def pop(self):
        """
        :rtype: void
        """
        self.list1.pop(0)

    def top(self):
        """
        :rtype: int
        """
        return self.list1[0]

    def getMin(self):
        """
        :rtype: int
        """
        if self.list1:
            elem = self.list1[0]
            for i in self.list1:
                if i < elem:
                    elem = i
            return elem
        return None
