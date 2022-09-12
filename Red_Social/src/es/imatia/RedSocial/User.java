package es.imatia.RedSocial;

import java.util.*;



public class User {
	private String name;
	private List<User> followedlist;
	private List<Post> listpost;
	
	
	public User(String name) {
		this.name = name;
	}

    public User(String name, List<User> followedlist, List<Post> listpost) {
    	this.name = name;
    	this.followedlist = followedlist;
    	this.listpost = listpost;
    	
}	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<User> getFollowedlist() {
		return followedlist;
	}
	public List<Post> getListpost() {
		return listpost;
	}
	 
	public void setListpost(List<Post> listpost) {
		this.listpost=listpost;
	}
	public void setFollowedlist(List<User> followedlist) {
		this.followedlist=followedlist;
	}
	
	public String getPostList() {
		String postsList = "";
		if (!this.getListpost().isEmpty()) {
			for (Post post:this.getListpost()) {
				if (post instanceof Image) {
					postsList += ((Image) post).getImageTitle() + "\n";
				}
				if (post instanceof Video) {
					postsList += ((Video) post).getVideoTitle() + "\n";
				}
				if (post instanceof Contents) {
					postsList += ((Contents) post).getContent() + "\n";
				}
			}
		}
		return postsList;
	}
}