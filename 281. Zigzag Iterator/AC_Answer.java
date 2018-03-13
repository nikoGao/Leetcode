public class ZigzagIterator {
	Iterator<Integer> it1;
	Iterator<Integer> it2;
	int turns;
	public ZigzagIterator(List<Integer> l1, List<Integer> l2){
		this.it1 = l1.iterator();
		this.it2 = l2.iterator();
		turns = 0;
	}

	public int next(){
		if(!hasNext()) return 0;
		turns++;
		if((turns%2==1 && it1.hasNext()) || (!it2.hasNext())) return it1.next();
		if((turns%2==0 && it2.hasNext()) || (!it1.hasNext())) return it2.next();
		return 0;
	}

	public boolean hasNext(){
		return it1.hasNext() || it2.hasNext();
	}
}