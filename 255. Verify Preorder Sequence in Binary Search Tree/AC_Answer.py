class Solution(object):
    def verifyPreorder(self, preorder):
        low = -sys.maxint
        stack = []
        for i in preorder:
            if i < low:
                return False
            while len(stack) != 0 and stack[-1] < i:
                low = stack.pop()
            stack.append(i)
        return True
