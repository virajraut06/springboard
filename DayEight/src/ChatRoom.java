import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

	List<Message> list = new ArrayList<>();
	
	public void chat() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		User user1 = new User(1,"John");
		User user2 = new User(2,"Alice");
		
		System.out.println("Chat room for "+user1.getName()+" and "+user2.getName());
		String message = "";
		int flag = 1;
		do {
			if(flag == 1) {
				System.out.println(user1.getName()+", type something (type exit to stop chat): ");
				message = br.readLine();
				if(!message.equalsIgnoreCase("exit")) {
					list.add(new Message(user1, message));
					flag = 2;
				}
			} else if(flag == 2) {
				System.out.println(user2.getName()+", type something (type exit to stop chat): ");
				message = br.readLine();
				if(!message.equalsIgnoreCase("exit")) {
					list.add(new Message(user2, message));
					flag = 1;
				}
			}
		}while(!message.equalsIgnoreCase("exit"));
	}
	
	public void displayChat() {
		for(Message obj:list) {
			System.out.println("User: " + obj.getName() + "\nMessage: " + obj.getMessage() + "\n--------------");	
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ChatRoom chatRoom = new ChatRoom();
		String choice = "";
		do {
			System.out.println("Select from the following options:"
					+ "\n1. - Chat now"
					+ "\n2. - Display chat"
					+ "\n3. - Exit");
			choice = br.readLine();
			switch(choice) {
			case "1":
				chatRoom.chat();
				break;
			case "2":
				chatRoom.displayChat();
				break;
			case "3":
				break;
			default:
				System.out.println("Enter proper choice!");
				break;
			}
		} while(!choice.equals("3"));
	}
	
}
