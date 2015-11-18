import java.io.*;

public class Ex3Impl implements Ex3 {
	
	public void showContents(String name) {
		try {
			File myFile = new File("." + File.separator + name);
			if(myFile.exists() && myFile.isDirectory()) {
				String[] myFiles = myFile.list();
				for(int index = 0; index < myFiles.length; index++) {
					System.out.println(myFiles[index]);
				}
			} else {
				System.out.println("FILE NOT FOUND");
			}
		} catch(NullPointerException ex) {
			ex.printStackTrace();
		} catch(SecurityException ex) {
			ex.printStackTrace();
		}
	}
	
}