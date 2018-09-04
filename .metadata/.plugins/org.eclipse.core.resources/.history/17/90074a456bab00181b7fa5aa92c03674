import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StringReadWrite {
	public static void main(String[] args) {
		String str = "Hello World";
		
		ObjectOutputStream objectOutputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("stringdata"));
			objectOutputStream.writeObject(str);
			
			objectInputStream = new ObjectInputStream(new FileInputStream("stringdata"));
			String s = (String) objectInputStream.readObject();
			System.out.println(s);
		} catch (IOException | ClassNotFoundException ce) {
			ce.printStackTrace();
		} finally {
			if(objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
