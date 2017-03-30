# Time Limited Exceed
class Solution(object):

    def findPermuataion(self, n):

        num = [i for i in range(1,n+1)]

        perms = [[]]

        for i in num:

            newperm = []

            for perm in perms:

                for n in xrange(len(perm) + 1):

                    newperm.append(perm[:n] + [i] + perm[n:])

            perms = newperm

        return perms

            

    def getPermutation(self, n, k):

        """

        :type n: int

        :type k: int

        :rtype: str

        """

        perms = self.findPermuataion(n)

        perms.sort(key= lambda x:str(x))

        res = perms[k-1]

        return ''.join(str(i) for i in res)

        
