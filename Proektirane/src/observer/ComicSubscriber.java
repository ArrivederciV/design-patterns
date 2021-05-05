package observer;

public class ComicSubscriber implements Reader {

	
	/*
	 * 1)create name of instance, and into constructor
	 * 2)to set Comic, create subscribedTo, and set to this.
	 * 3)create getter and update a message 
	 * 4)check if theres one with if
	 */
	
	private String name;
	private Readable subscribedTo;
	
	public String getName() {
		return name;
	}

	public ComicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.subscribedTo == null) {
			System.out.println(this.getName() + "has no comic");
			return;
		}
		
		String newComic = this.subscribedTo.getUpdate();
		System.out.println(this.getName() + " received an update: " + newComic);

	}

	@Override
	public void setComic(Readable comic) {
		this.subscribedTo = comic;

	}

}
