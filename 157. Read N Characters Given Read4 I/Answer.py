def read4(buf):
    global file_content
    i = 0
    while i < len(file_content) and i < 4:
        buf[i] = file_content[i]
        i += 1
    
    if len(file_content) > 4:
        file_content = file_content[4:]
    else:
        file_content = ""
    return i
        
class Solution(object):
    def read(self, buf, n):
        """
        :type buf: Destination buffer (List[str])
        :type n: Maximum number of characters to read (int)
        :rtype: The number of characters read (int)
        """
	read_bytes = 0
	buff = ['']*4
	for i in range(n/4+1):
		size = read4(buff)
		if size:
			buf[read_bytes:read_bytes+size] = buff
			read_bytes += size
		else:
			break
	return min(read_bytes, n)