# Definition for an interval.

# class Interval(object):

#     def __init__(self, s=0, e=0):

#         self.start = s

#         self.end = e



class Solution(object):

    def merge(self, intervals):

        """

        :type intervals: List[Interval]

        :rtype: List[Interval]

        """

        intervals.sort(key=lambda x:x.start)

        res = []

        for i in range(len(intervals)):

            if res == []:

                res.append(intervals[i])

            else:

                size = len(res)

                if res[size-1].start <= intervals[i].start and res[size-1].end >= intervals[i].start:

                    res[size-1].end = max(res[size-1].end, intervals[i].end)

                else:

                    res.append(intervals[i])

        return res

                
