# heap
# 因为要知道之前有overlap的最小的end，所以可以用一个min heap。每次检查新的start是否比heap的top元素小，是的话就把保存原来的end，同时放进新的end；否则就放新的end同时poll出原来的，因为没有overlap且新的end较大。最后heap的大小就是需要的房间数。比如：
# [1, 5], [2, 4], [3, 6], [5, 7]

# heap: [5]。[2, 4]的start是2，比5小，所以放入4。
# heap: [4, 5]。接着[3 ,6]的start是3，比4小，所以又放入6。
# heap: [4, 5, 6]。[5, 7]的start是5，比4大，因此poll出4，放入7。
# heap: [5, 6, 7]。最后heap的size为3。
# 4被pop出来是因为[2, 4]和[5, 7]公用一个房间，只要放7进去就可以了。


class Solution(object):
    def minMeetingRooms(self, intervals):
        heap, num = [], 0
        heapq.heapify(heap)
        intervals.sort(lambda a, b:a.start-b.start)
        for i in range(len(intervals)):
            if len(heap) == 0:
                heapq.heappush(heap, intervals[i].end)
                num += 1
                continue
            if heap[0] <= intervals[i].start:
                heapq.heappop(heap)
                heapq.heappush(heap, intervals[i].end)
            else:
                heapq.heappush(heap, intervals[i].end)
                num += 1
        return num
