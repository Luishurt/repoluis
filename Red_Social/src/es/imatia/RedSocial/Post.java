package es.imatia.RedSocial;

import java.util.*;
import java.time.LocalDate;




public class Post {
	private LocalDate PostDate;
	private ArrayList<Comment> listPost;
		
	public Post(LocalDate PostDate, ArrayList<Comment> listPost) {
		this.PostDate = PostDate; 
		this.listPost = listPost;
	}
	
	public LocalDate getPostDate() {
		return PostDate;
		
	}
	
	public void setPostDate (LocalDate PostDate) {
		this.PostDate = PostDate;
	}
	
	public ArrayList<Comment> getListPost(){
		return listPost;
	}
	
	public void setListComment (ArrayList<Comment> listPost) {
		this.listPost = listPost;
	}
}

