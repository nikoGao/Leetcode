class Solution(object):

    def thirdMax(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        if not nums:

            return None

        first, second, third = None, None, None

        for i in nums:

            if i > first:

                third = second

                second = first

                first = i

            elif i < first and i > second:

                third = second

                second = i

            elif i < second and i > third:

                third = i

            else:

                continue

        if third != None:

            return third

        else:

            return first
