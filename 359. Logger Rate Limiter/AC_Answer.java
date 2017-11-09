public class Logger{
	private Map<String, Integer> ok = new HashMap<String, Integer>();

	public boolean shouldPrintMessage(int timeStamp, String message){
		if(map.containsKey(message)){
			if(timeStamp-map.get(message)>10) return false
		map.put(message, timeStamp);
		return true;
	}
}