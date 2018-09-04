import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File path = new File("D:\\JavaWorkspace\\lavina\\DaySixAssignment");
		File[] listOfFiles =  path.listFiles();
		
		for(int i=0; i<listOfFiles.length; i++) {
			if(listOfFiles[i].isFile()) {
				System.out.println("File: "+listOfFiles[i].getName());
			} else if(listOfFiles[i].isDirectory()) {
				System.out.println("Directory: "+listOfFiles[i].getName());
			}
		}
	}
}
