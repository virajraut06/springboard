import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("data");
			int val;
			while((val = inputStream.read()) != -1) {
				System.out.print((char)val);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
