import java.io.*;

public class Ex2Impl implements Ex2 {
	
	public void createDirectory(String name) {
		try {
			File newDirectory = new File(name);
			boolean directoryCreated = newDirectory.mkdir();
		} catch(NullPointerException ex) {
			ex.printStackTrace();
		} catch(SecurityException ex) {
			ex.printStackTrace();
		}
	}
	
}