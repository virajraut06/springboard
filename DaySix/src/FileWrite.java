import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
		FileOutputStream outputStream = null;
		String str = "Welcome to Xoriant!";
		try {
			outputStream = new FileOutputStream("dataOutput", true);
			outputStream.write(str.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
