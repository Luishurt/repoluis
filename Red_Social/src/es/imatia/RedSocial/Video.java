package es.imatia.RedSocial;

import java.time.LocalDate;
import java.util.*;

public class Video extends Post {
	
	private String VideoTitle;
	private String VideoQuality;
	private Integer VideoLenght;
	
	public Video(LocalDate PostDate, ArrayList<Comment> listPost, String VideoTitle, String VideoQuality, Integer VideoLenght ) {
		super(PostDate, listPost);
		this.VideoTitle = VideoTitle;
		this.VideoQuality = VideoQuality;
		this.VideoLenght = VideoLenght;
	}

	public String getVideoTitle() {
		return VideoTitle;
	}
	
	public void SetVideoTitle(String VideoTitle) {
		this.VideoTitle = VideoTitle;
	}
	
	
	public String getVideoQuality() {
		return VideoQuality;
	}
	
	public void setVideoQuality(String VideoQuality) {
		this.VideoQuality = VideoQuality;
	}
	
	public Integer getVideoLenght() {
		return VideoLenght;
	}
	
	public void setVideoLenght (Integer VideoLenght) {
		this.VideoLenght = VideoLenght;
	}
}
