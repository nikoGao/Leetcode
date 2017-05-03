# peek():find first elem, next() return first item and the point will move to the next

# Below is the interface for Iterator, which is already defined for you.
#
# class Iterator(object):
#     def __init__(self, nums):
#         """
#         Initializes an iterator object to the beginning of a list.
#         :type nums: List[int]
#         """
#
#     def hasNext(self):
#         """
#         Returns true if the iteration has more elements.
#         :rtype: bool
#         """
#
#     def next(self):
#         """
#         Returns the next element in the iteration.
#         :rtype: int
#         """

class PeekingIterator(object):
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.itera = iterator
        self.nextValue = 0
        self.end = False
        if self.itera.hasNext():
            self.nextValue = self.itera.next()
        else:
            self.end = True

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if not self.end:
            return self.nextValue
        else:
            return 0
        

    def next(self):
        """
        :rtype: int
        """
        current = self.nextValue
        if self.itera.hasNext():
            self.nextValue = self.itera.next()
        else:
            self.end = True
        return current
        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.end:
            return False
        return True
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].
