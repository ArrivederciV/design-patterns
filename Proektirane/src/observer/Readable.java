package observer;

public interface Readable {

	/*
	 * 1) make 2way connection (sub-unsub)
	 * 2) notifyReaders() - notify for a change happening
	 * 3) to use the update as a value
	 */
	void subscribe(Reader reader);
	void unsubscribe(Reader reader);
	
	void notifyReaders();
	
	String getUpdate();
}
