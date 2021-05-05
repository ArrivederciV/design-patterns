package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Ivan");
		User user2 = new ChatUser(chat, "Daniel");
		User user3 = new ChatUser(chat, "Petar");

		user2.send("Hi, boyz");
	}

}
