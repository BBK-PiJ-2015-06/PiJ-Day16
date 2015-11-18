/**
 * Write a program that takes a name from the user at the command line. 
 * If a file with that name exists, the program must show its contents 
 * on screen. If it does not, the program must say so.
 */

public interface Ex3 {
	
	/**
	 * Displays the contents of the file with name given by user.
	 * If a file does not exist with the name given, a "File Not Found" 
	 * message is displayed on the screen.
	 *
	 * @param name - the name of the file to be found and whose contents
	 *               are to be displayed.
	 */
	void showContents(String name);
}