import java.io.*;

public class Ex1Impl implements Ex1 {
	
	public void printFiles() {
		try {
			File currentDirectory = new File("." + File.separator);
			String[] fileList = currentDirectory.list();
			for(int index = 0; index < fileList.length; index++) {
				System.out.println(fileList[index]);
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (SecurityException ex) {
			ex.printStackTrace();
		}
	}
}