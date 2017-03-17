class Solution(object):

    def fizzBuzz(self, n):

        """

        :type n: int

        :rtype: List[str]

        """

        output = []

        for i in range(1, n+1):

            if i % 3 == 0 and i % 15 != 0:

                output.append('Fizz')

            elif i % 5 == 0 and i % 15 != 0:

                output.append('Buzz')

            elif i % 15 == 0:

                output.append('FizzBuzz')

            else:

                output.append(str(i))

        return output
