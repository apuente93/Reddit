///////////////////////////////////////////////////////////////////////////////
// Main Class File:  Reddit.java
// File:             RedditDB.java
// Author:           Alejandro Puente (apuente@wisc.edu)
///////////////////////////////////////////////////////////////////////////////
import java.util.List;
import java.util.ArrayList;
/**
 * This class is used to manage the database of users
 *
 * <p>Bugs: None
 *
 * @author Alejandro Puente
 */
public class RedditDB {
	//
	private List<User> users;

	/*Search the database for a user with the given name and delete the information
	 *  if found; else return null. Deletion also involves undoing all information 
	 *  related to the user: (i) For each posted post, remove it from the liked and
	 *   disliked information of all users. (ii) Undo all likes. (iii) 
	 *   Undo all dislikes.*/
	public RedditDB() {
		this.users = new ArrayList<User>();
	}

	/*Search the database for a user with the given name and delete the information
	 *  if found; else return null. Deletion also involves undoing all information 
	 *  related to the user: (i) For each posted post, remove it from the liked and
	 *   disliked information of all users. (ii) Undo all likes. (iii) 
	 *   Undo all dislikes.*/
	public List<User> getUsers() {
		return this.users;
	}

	/*Search the database for a user with the given name and delete the information
	 *  if found; else return null. Deletion also involves undoing all information 
	 *  related to the user: (i) For each posted post, remove it from the liked and
	 *   disliked information of all users. (ii) Undo all likes. (iii) 
	 *   Undo all dislikes.*/
	public User addUser(String name) {
		
		for (int i = 0; i < users.size(); i++) {
			if (name.equals(users.get(i).getName())) {
				return null;
			}
		}
		
		User newUser = new User(name);
		users.add(newUser);
		return newUser;
	}

	/*Search the database for a user with the given name and delete the information
	 *  if found; else return null. Deletion also involves undoing all information 
	 *  related to the user: (i) For each posted post, remove it from the liked and
	 *   disliked information of all users. (ii) Undo all likes. (iii) 
	 *   Undo all dislikes.*/
	public User findUser(String name) {
		
		for (int i = 0; i < users.size(); i++) {
			if (name.equals(users.get(i).getName())) {
				return users.get(i);
			}
		}
		return null;
	}
	
	/*Search the database for a user with the given name and delete the information
	 *  if found; else return null. Deletion also involves undoing all information 
	 *  related to the user: (i) For each posted post, remove it from the liked and
	 *   disliked information of all users. (ii) Undo all likes. (iii) 
	 *   Undo all dislikes.*/
	public boolean delUser(String name) {
		//TODO
	}

	/*Search the database for a user with the given name and delete the information
	 *  if found; else return null. Deletion also involves undoing all information 
	 *  related to the user: (i) For each posted post, remove it from the liked and
	 *   disliked information of all users. (ii) Undo all likes. (iii) 
	 *   Undo all dislikes.*/
	public List<Post> getFrontpage(User user) {
		//TODO
	}

	/*Search the database for a user with the given name and delete the information
	 *  if found; else return null. Deletion also involves undoing all information 
	 *  related to the user: (i) For each posted post, remove it from the liked and
	 *   disliked information of all users. (ii) Undo all likes. (iii) 
	 *   Undo all dislikes.*/
	public List<Post> getFrontpage(User user, String subreddit) {
		//TODO
	}
}
