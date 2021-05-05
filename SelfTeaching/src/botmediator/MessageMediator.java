package botmediator;

public interface MessageMediator {

	void addUser(User user);
	//void addBot(Bot bot);
	
	void sendMessage(String message, User user);
	
}
