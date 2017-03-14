class Solution(object):

    def intersection(self, nums1, nums2):

        """

        :type nums1: List[int]

        :type nums2: List[int]

        :rtype: List[int]

        """

        if nums1 == [] or nums2 == []:

            return []

        nums1 = list(set(nums1))

        nums2 = list(set(nums2))

        intersec = []

        for i in range(len(nums2)):

            if nums2[i] in nums1:

                intersec.append(nums2[i])

        return intersec
