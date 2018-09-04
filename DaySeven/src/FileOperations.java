import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations {
	private String str;
	private boolean flag = true;
	public synchronized String getStr() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("myFile");
			int val;
			System.out.println("File Contents:");
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
		notify();
		flag = true;
		return str;
	}

	public synchronized void setStr() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			System.out.println("Enter string to write in file:");
			str = br.readLine() + "\n";
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("PUT: "+str);
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("myFile", true);
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
		flag =  false;
		notify();
	}
}
