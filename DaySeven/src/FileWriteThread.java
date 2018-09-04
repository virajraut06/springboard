public class FileWriteThread extends Thread {
	private FileOperations fileOperations;
	public FileWriteThread(FileOperations fileOperations) {
		this.fileOperations = fileOperations;
		start();
	}
	
	@Override
	public void run() {
		while(true) {
			fileOperations.setStr();
		}
	}
}
