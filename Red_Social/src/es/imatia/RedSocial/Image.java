package es.imatia.RedSocial;

import java.time.LocalDate;
import java.util.*;

public class Image extends Post {
	private String ImageTitle;
	private Integer ImageHeight;
	private Integer ImageWidth;
	
	
	public Image(LocalDate PostDate, ArrayList<Comment> listPost, String ImageTitle, Integer ImageHeight, Integer ImageWidth) {
		super(PostDate, listPost);
		this.ImageTitle = ImageTitle;
		this.ImageHeight = ImageHeight;
		this.ImageWidth = ImageWidth;
	}
	public String getImageTitle() {
		return ImageTitle;
	}
	
	public void setImageTitle(String ImageTitle) {
		this.ImageTitle = ImageTitle;
	}
	public Integer getImageHeight(){
		return ImageHeight;
	}
	public void setImagHeight (Integer ImageHeight) {
		this.ImageHeight = ImageHeight;
	}
	public Integer getImageWidth(){
		return ImageWidth;
	}
	public void setImagWidth (Integer ImageWidth) {
		this.ImageWidth = ImageWidth;
	}	

	
}


