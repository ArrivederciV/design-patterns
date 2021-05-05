package botmediator;

public class Bot {

	private static Bot bot;
	public Bot() {

	}
	
	public static Bot getBot() {
		if(bot == null) {
			bot = new Bot();
		}
		return bot;
	}
	
	public void botMessage(String bmessage) {
		
		System.out.println("Bot Garry says:  " + bmessage);
	}
}
