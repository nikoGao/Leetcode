/***
/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */
 
public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
***/

public int read(char[] buf, int n){
    int[] buffer = new int[4];
    boolean etof = false;
    int character = 0;
    while(!etof && character < n){
	int read = read4(buffer);
	if(read < 4) etof = true;  //check whether it is the end of the string
	read = Math.min(n-character, read);
	for(int i = 0; i< read; i++){
	    buf[character+i] = buffer[i];
	}
	character += read;
    }
}
