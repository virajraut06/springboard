
public class Message extends User {
	private String message;
	public Message(User user, String message) {
		super(user.getId(), user.getName());
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}