///////////////////////////////////////////////////////////////////////////////
// Main Class File:  Reddit.java
// File:             User.java
// Author:           Alejandro Puente (apuente@wisc.edu)
///////////////////////////////////////////////////////////////////////////////
import java.util.List;
import java.util.ArrayList;
/**
 * The User class represents the data associated with a single user. 
 * The class will store the name of the user as a String, the karma 
 * as an object of type Karma, a List<String> denoting the subreddits 
 * the user is subscribed to and different List<String>s which store 
 * information regarding which posts were posted, liked or disliked 
 * by the user. 
 *
 * <p>Bugs: None
 *
 * @author Alejandro Puente
 */
public class User {
	final private String name;
	final private Karma karma;
	private List<String> subscribed;
	private List<Post> posted;
	private List<Post> liked;
	private List<Post> disliked;

	public User(String name) {
		//TODO
	}

	public String getName() {
		return this.name;
	}

	public Karma getKarma() {
		return this.karma;
	}

	public List<String> getSubscribed() {
		//TODO
	}

	public List<Post> getPosted() {
		//TODO
	}

	public List<Post> getLiked() {
		//TODO
	}

	public List<Post> getDisliked() {
		//TODO
	}

	public void subscribe(String subreddit) {
		//TODO
	}

	public void unsubscribe(String subreddit) {
		//TODO
	}

	public Post addPost(String subreddit, PostType type, String title) {
		//TODO
	}

	public void like(Post post) {
		//TODO
	}

	public void undoLike(Post post) {
		//TODO
	}

	public void dislike(Post post) {
		//TODO
	}

	public void undoDislike(Post post) {
		//TODO
	}
}
