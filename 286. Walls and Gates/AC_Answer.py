# BFS

class Solution:
    def tag(self, rooms, row, col, dist):
    	if row < 0 or row > len(rooms) or col < 0 or col > len(rooms[row]):
	    return
	if rooms[row][col] == -1 or rooms[row][col] < dist:
	    return
	rooms[row][col] = dist
	self.tag(rooms, row, col-1, dist+1)
	self.tag(rooms, row, col+1, dist+1)
	self.tag(rooms, row-1, col, dist+1)
	self.tag(rooms, row+1, col, dist+1)

    def wallsAndGates(self, rooms):
    	for row in range(len(rooms)):
	    for col in range(len(rooms[row])):
	        if rooms[row][col] == 0:
		    self.tag(rooms, row, col, 0)
