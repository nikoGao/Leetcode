#Thought: 
#1.For start: If A[mid] < target, then the range must begins on the right of mid (hence i = mid+1 for the next iteration)
#If A[mid] > target, it means the range must begins on the left of mid (j = mid-1)
#If A[mid] = target, then the range must begins on the left of or at mid (j= mid)
#Case 2 and 3 can be combined. And No matter what the sequence originally is, as we narrow down the search range, eventually we will be at a situation where there are only two elements in the search range.

#For end: the thinking is similiar as the start side, but there is one thing to be noticed. When we use mid = (i+j)/2, the mid is rounded to the lowest integer. In other words, mid is always biased towards the left. This means we could have i == mid when j - i == mid, but we NEVER have j == mid. So in order to keep the search range moving, you must make sure the new i is set to something different than mid, otherwise we are at the risk that i gets stuck. But for the new j, it is okay if we set it to mid, since it was not equal to mid anyways. Our two rules in search of the left boundary happen to satisfy these requirements, so it works perfectly in that situation. Similarly, when we search for the right boundary, we must make sure i won't get stuck when we set the new i to i = mid. The easiest way to achieve this is by making mid biased to the right, i.e. mid = (i+j)/2+1.


class Solution(object):

    def searchRange(self, nums, target):

        """

        :type nums: List[int]

        :type target: int

        :rtype: List[int]

        """

        l, r = 0, len(nums) - 1

        res = [-1, -1]

        if not nums:

            return res

        while l < r:

            mid = (l + r) / 2

            if nums[mid] < target:

                l = mid + 1

            else:

                r = mid

        if nums[l] == target:

            res[0] = l

        r = len(nums) - 1

        while l < r:

            mid = (l + r) / 2 + 1

            if nums[mid] > target:

                r = mid - 1

            else:

                l = mid

        if nums[r] == target:

            res[1] = r

        return res

                
