class Solution(object):
    def isPalidrome(self, s):
        if s == '':
            return True
        else:
            list1 = [i.lower() for i in s if i.isalnum()]
            i = 0
            j = len(list1)-1
            while i <= j:
                if list1[i] != list1[j]:
                    return False
                i += 1
                j -= 1
            return True
