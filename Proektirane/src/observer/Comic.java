package observer;

import java.util.ArrayList;
import java.util.List;

public class Comic implements Readable {

	
	/*
	 * 1)to remove/add , create list
	 * 2)make it arraylist into constructor
	 * 3)utilize sub-unsub
	 * 4)for loop to notify readers
	 * 5)create string to have something to update
	 * 
	 * 6) upon subscribe reader to comic,
	 * 		- add reader to subscribers
	 * 		- add comic as comic to reader
	 */
	
	private List<Reader> subscribers;
	private String comic;
	
	

	public Comic() {
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(Reader reader) {
		this.subscribers.add(reader);
		reader.setComic(this);
		
	}

	@Override
	public void unsubscribe(Reader reader) {
		this.subscribers.remove(reader);
		
	}

	@Override
	public void notifyReaders() {
		for(Reader reader: this.subscribers) {
			reader.update();
		}
		
	}

	//getter and setter
	@Override
	public String getUpdate() {
		return this.comic;
	}
	public void setComic(String comic) {
		this.comic = comic;
		this.notifyReaders();
	}

}
