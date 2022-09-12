package es.imatia.RedSocial;

import java.time.LocalDate;

public class Comment {
	private String CommentText;
	private LocalDate CommentDate;
	private String CommentUser;
	
	public Comment(String CommentText, LocalDate CommentDate, String CommentUser) {
		this.CommentText = CommentText;
		this.CommentDate = CommentDate;
		this.CommentUser = CommentUser;
	}

	public String getCommentText() {
		return CommentText;
	}
	public void setCommentText(String CommentText) {
		this.CommentText = CommentText;
	}
	public LocalDate getCommentDate() {
		return CommentDate;
	}
	public void setCommentDate(String setCommentDate) {
		this.CommentDate = CommentDate;
	}
	public String getCommentUser() {
		return CommentUser;
	}
	public void setCommentUser(String CommentUser) {
		this.CommentUser = CommentUser;		
	}

}
