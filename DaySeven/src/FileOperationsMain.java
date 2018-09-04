
public class FileOperationsMain {
	public static void main(String[] args) {
		FileOperations fileOperations = new FileOperations();
		new FileWriteThread(fileOperations);
		new FileReadThread(fileOperations);
	}
}
