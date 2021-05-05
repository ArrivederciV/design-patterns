package mediator;

public class ChatUser extends User {

	/*
	 * 1) create class Chatuser with abstractinherited and constructor
	 * 2)println that he sends and add mediator to take care of the sending
	 * 3)add chatuser with 'this' in constructor chatuser
	 */
	
	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);

	}

}
