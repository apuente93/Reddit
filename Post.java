///////////////////////////////////////////////////////////////////////////////
// Main Class File:  Reddit.java
// File:             Post.java
// Author:           Alejandro Puente (apuente@wisc.edu)
///////////////////////////////////////////////////////////////////////////////
/**
 * The Post class represents a single post that keeps track of the user who 
 * posted it, the subreddit it was posted to, the type of the post 
 * (of type PostType, also provided), the title of the post and the 
 * karma (points) received by it. 
 *
 * <p>Bugs: None
 *
 * @author Alejandro Puente
 */
public class Post {
	final private User user;
	final private String subreddit;
	final private PostType type;
	final private String title;
	private int karma;

	public Post(User user, String subreddit, PostType type, String title) {
		//TODO
	}

	public void upvote() {
		//TODO
	}

	public void downvote() {
		//TODO
	}

	public User getUser() {
		return this.user;
	}

	public String getSubreddit() {
		return this.subreddit;
	}

	public PostType getType() {
		return this.type;
	}

	public String getTitle() {
		return this.title;
	}

	public int getKarma() {
		return this.karma;
	}
}
