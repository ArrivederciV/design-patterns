package observer;

public interface Reader {

	/*
	 * 1) to get the update void update();
	 * 2)set reader connected to readable
	 */
	void update();
	
	void setComic(Readable comic);
	
}
