#为了防止time exceed，使用双栈法，增加一个stack存储当前序列最小值，重点改进pop()and push()
class MinStack(object):

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []
        self.minStack = []

    def push(self, x):
        """
        :type x: int
        :rtype: nothing
        """
        self.stack.append(x)
        if len(self.minStack) == 0 or x <= self.minStack[-1]:
            self.minStack.append(x)

    def pop(self):
        """
        :rtype: nothing
        """
        if not self.isEmpty():
            if self.top() == self.minStack[-1]:
                self.minStack.pop()
            self.stack.pop()
        return

    def top(self):
        """
        :rtype: int
        """
        if not self.isEmpty():
            return self.stack[-1]

    def getMin(self):
        """
        :rtype: int
        """
        if not self.isEmpty():
            return self.minStack[-1]

    def isEmpty(self):
        return len(self.stack) < 1
