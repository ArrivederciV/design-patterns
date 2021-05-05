package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	/*
	 * 1)create Chat class with abstract/constructor
	 * 2)create List for storing users;
	 * 3)add user, and for loop for each sent message, receive to everyone in list
	 */
	
	private List<User> users;
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void sendMessage(String message, User user) {
		for(User chatUser: this.users) {
			if(user != chatUser) {
				chatUser.receive(message); 
			}
		}

	}

	@Override
	public void receiveMessage(String message, User user) {
		// TODO Auto-generated method stub
		
	}

}
