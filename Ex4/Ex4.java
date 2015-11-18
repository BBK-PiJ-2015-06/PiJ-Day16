import java.io.*;

/**
 * Write a program that takes two names from the user at the command line. 
 * If a file with the first name exists, the program must copy it into a 
 * file with the second name. If the first file does not exist, the program 
 * must say so. If the second file does exists, the program must ask the
 * user whether to overwrite it or not, and act accordingly
 */

public interface Ex4 {
	
	/**
	 * Copies the first File (file1) into the second File (file2).
	 * If file1 does not exist the method performs no function and
	 * prints a "FILE NOT FOUND" message to the screen. If file2
	 * exists the method requests of the user whether the contents
	 * of file2 should be overwritten or not, and behaves accordingly.
	 *
	 * @ param file1 - the File to be copied
	 * @ param file2 - the File that file1 is to be copied into 
	 */
	void copyFile(File file1, File file2);
	
}