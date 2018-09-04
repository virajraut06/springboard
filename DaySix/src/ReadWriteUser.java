import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteUser {
	public static void main(String[] args) {
		User user = new User("user1","password");
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("userObject"));
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("userObject"));	) { 
			objectOutputStream.writeObject(user);
			System.out.println("User object written in file");
			
			User userVar = (User) objectInputStream.readObject();
			System.out.println(userVar);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
