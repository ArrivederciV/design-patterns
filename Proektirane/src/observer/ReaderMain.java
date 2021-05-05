package observer;

public class ReaderMain {

	public static void main(String[] args) {
		
		Comic comic = new Comic();

		Reader read1 = new ComicSubscriber("Comic subscriber 01");
		Reader read2 = new ComicSubscriber("Comic subscriber 02");
		Reader read3 = new ComicSubscriber("Comic subscriber 03"); 
		
		comic.subscribe(read1);
		comic.subscribe(read2);
		comic.subscribe(read3);
		
		comic.setComic(" has bought a new one: Superman #973");
	}

}
