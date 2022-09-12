package es.imatia.RedSocial;

import java.time.LocalDate;
import java.util.*;

public class Contents extends Post {
	private String Content;
	

	public Contents(LocalDate PostDate, ArrayList<Comment> listPost, String Content ) {
		super(PostDate, listPost);
		this.Content = Content;   
}

	public String getContent() {
		return Content;
	}
	
	public void setContent (String Content) {
		this.Content = Content;
	}
	
}
