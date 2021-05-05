package botmediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	Bot connect = Bot.getBot();
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
		if(message == "Cat") {
			System.out.println("User " + user.name +  " is removed for saying the C-word" );
			users.remove(user);
			connect.botMessage("This C-word is not permitted");
		}

	}
}
