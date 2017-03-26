class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        def generateParenthesisList(parents):
            res = []
            for each in parents:
                list1 = list(each)
                for i in range(len(list1)):
                    if list1[i] == '(':
                        temp1 = list1[:i]+ ['()'] + list1[i:]
                        temp2 = list1[:i+1] + ['()'] + list1[i+1:]
                        res.append(''.join(i for i in temp1))
                        res.append(''.join(i for i in temp2))
            return list(set(res))
        if n == 0:
            return []
        if n == 1:
            return ['()']
        res = ['()'] 
        while n>1:
            res = generateParenthesisList(res)
            n -= 1
        return res
