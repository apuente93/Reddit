///////////////////////////////////////////////////////////////////////////////
// Title:            Reddit
// Files:            Reddit.java, RedditDB.java, Karma.java, Post.java, 
//					 PostType.java, User.java
// Author:           Alejandro Puente (apuente@wisc.edu)
///////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;
/**
 * The application program, Reddit, creates and uses an RedditDB to represent 
 * and process information. The user and post information is read from a text 
 * files (explained above) and then the program processes user commands.
 *
 * <p>Bugs: None
 *
 * @author Alejandro Puente
 */
public class Reddit {
	
	public static void main (String[] args) {

		try {
			if (args.length == 0)
			{
				throw new IllegalArgumentException();
			}
			for (int i = 0; i < args.length; i++) {
				
				File userProfile = new File (args[i]);
				Scanner fileIn = new Scanner(userProfile);
				
				if (!fileIn.hasNextLine()) {
					throw new FileNotFoundException();
				}
				else {
					while (fileIn.hasNextLine())
					{
						String line = fileIn.nextLine(); 
						//TODO: Read data from file and store accordingly in RedditDB
					}
				}
			}
		}
		catch (IllegalArgumentException a) {
			System.out.println("Usage: java Reddit <FileNames>");
		}
		catch (FileNotFoundException b) {
			System.out.println("File <FileName> not found.");
		}
	}
}
