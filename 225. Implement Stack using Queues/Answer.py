class MyStack(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.list1 = []
        

    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: void
        """
        self.list1.insert(0,x)

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        elem = self.list1.pop(0)
        return elem

    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        return self.list1[0]

    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        if len(self.list1) == 0:
            return True
        return False


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()
