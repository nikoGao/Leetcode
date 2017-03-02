#因为是有序的，所以头尾指针共同移动，比较大小
class Solution(object):i

    def twoSum(self, numbers, target):

        """

        :type numbers: List[int]

        :type target: int

        :rtype: List[int]

        """

        head, end = 0, len(numbers)-1

        while head < end:

            if numbers[head] + numbers[end] == target:

                return [head+1, end+1]

            elif numbers[head] + numbers[end] > target:

                end -= 1

            else:

                head += 1
