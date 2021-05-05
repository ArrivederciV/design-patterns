package mediator;

public abstract class User {

	/*
	 * 1) makes refactoring objects easier by using this template as
	 * mediator between objects and the link between them
	 * 2)create constructor for user
	 * 3) send/receive ability, name for users
	 * 4) user constructor getting mediator and user name
	 */
	
	protected MessageMediator mediator;
	protected String name;
	
	public User(MessageMediator mediator, String name) {
		
		this.mediator = mediator;
		this.name = name;
		
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);

}
