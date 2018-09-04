
public class FileReadThread extends Thread {
	private FileOperations fileOperations;
	public FileReadThread(FileOperations fileOperations) {
		this.fileOperations = fileOperations;
		start();
	}
	
	@Override
	public void run() {
		while(true) {
			fileOperations.getStr();
		}
	}
}
