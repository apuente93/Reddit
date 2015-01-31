///////////////////////////////////////////////////////////////////////////////
// Main Class File:  Reddit.java
// File:             Karma.java
// Author:           Alejandro Puente (apuente@wisc.edu)
///////////////////////////////////////////////////////////////////////////////
/**
 * The Karma class represents the points accrued by a single user. Karma 
 * is of two subtypes, linkKarma and commentKarma, relating to LINK and 
 * COMMENT PostTypes respectively; SELF posts do not affect the Karma of the 
 * creating user. A new user will have karmas of both types initialised to zero.
 *
 * <p>Bugs: None
 *
 * @author Alejandro Puente
 */
public class Karma {
	private int linkKarma;
	private int commentKarma;

	public Karma() {
		this.linkKarma = 0;
		this.commentKarma = 0;
	}

	public void upvote(PostType type) {
		//TODO
	}

	public void downvote(PostType type) {
		//TODO
	}

	public int getLinkKarma() {
		return this.linkKarma;
	}

	public int getCommentKarma() {
		return this.commentKarma;
	}
}
