# Iterative, when detect a symbol, divide it into left and right part

class Solution(object):

    def diffWaysToCompute(self, input):

        """

        :type input: str

        :rtype: List[int]

        """

        ans = []

        for i in range(len(input)):

            c = input[i]

            if c in '+-*':

                a = self.diffWaysToCompute(input[:i])

                b = self.diffWaysToCompute(input[i+1:])

                for x in a:

                    for y in b:

                        if c == '+':

                            ans.append(x+y)

                        if c == '-':

                            ans.append(x-y)

                        if c == '*':

                            ans.append(x*y)

        if not ans:

            ans.append(int(input))

        return ans
