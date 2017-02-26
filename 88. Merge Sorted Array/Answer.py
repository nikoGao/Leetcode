#m,n分别为两个list索取的元素个数
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        length1 = len(nums1)
        while length1>m:
            nums1.pop()
            length1 -= 1
        nums1.extend(nums2[0:n])
        nums1.sort()
