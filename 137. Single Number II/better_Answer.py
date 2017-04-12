# bit manipulate
# use the numbers of 1's to caculate

class Solution(object):

    def singleNumber(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        ec1, ec2, ec3 = 0, 0, 0

        for ai in nums:

            ec3 = ec2 & ai

            ec2 = (ec2 | (ec1 & ai)) & (~ec3)

            ec1 = (ec1 | ai) & (~ec3)        

        return ec1

        
