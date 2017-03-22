class Solution(object):

    def nextGreaterElement(self, findNums, nums):

        """

        :type findNums: List[int]

        :type nums: List[int]

        :rtype: List[int]

        """

        result = []

        l1, l2 = len(findNums), len(nums)

        for each in findNums:

            each_index = nums.index(each)

            if each_index == l2 - 1:

                result.append(-1)

                continue

            i = each_index + 1

            while i < l2:

                if nums[i] > each:

                    result.append(nums[i])

                    break

                i += 1

            if i == l2:

                result.append(-1)

        return result
