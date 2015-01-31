import java.util.List;
import java.util.ArrayList;

public class RedditDB {
	private List<User> users;

	public RedditDB() {
		this.users = new ArrayList<User>();
	}

	public List<User> getUsers() {
		return this.users;
	}

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

	public User findUser(String name) {
		
		for (int i = 0; i < users.size(); i++) {
			if (name.equals(users.get(i).getName())) {
				return users.get(i);
			}
		}
		return null;
	}

	public boolean delUser(String name) {
		//TODO
	}

	public List<Post> getFrontpage(User user) {
		//TODO
	}

	public List<Post> getFrontpage(User user, String subreddit) {
		//TODO
	}
}
