// Java Iterator interface reference:
// First get next element out, and store in a variable
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> it;
    private Integer next;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
        if(it.hasNext()) next = it.next();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer temp = next;
        next = it.hasNext()? it.next() : null;
        return temp;
	}

	@Override
	public boolean hasNext() {
	    return next !=null;
	}
}
