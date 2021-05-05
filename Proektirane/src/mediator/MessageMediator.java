package mediator;

public interface MessageMediator {

	/*
	 * 1) add user
	 * 2) send/receive
	 */
	void addUser(User user);
	
	void sendMessage(String message,User user);
	void receiveMessage(String message, User user);
}
