package com.model;

public class Comment {

    private String id;
    private String text;
    private String commentAuthor;

    public Comment(String id, String text, String commentAuthor) {
        this.id = id;
        this.text = text;
        this.commentAuthor = commentAuthor;
    }

    public Comment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }
}
