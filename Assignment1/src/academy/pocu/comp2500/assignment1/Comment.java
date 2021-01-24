package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comment {
    private String comment;
    private ArrayList<Comment> subcomments;
    private ArrayList<String> userIdUpvote;
    private ArrayList<String> userIdDownvote;
    private String commentId;

    public Comment(String comment, String userId) {
        this.commentId = userId;
        this.comment = comment;
        this.subcomments = new ArrayList<>();
        this.userIdUpvote = new ArrayList<>();
        this.userIdDownvote = new ArrayList<>();
    }
    // public String getComment() {
        // return this.comment;
    // }
    public String getCommentId() {
        return this.commentId;
    }
    public ArrayList<String> getUserIdUpvote() {
        return this.userIdUpvote;
    }
    public ArrayList<String> getUserIdDownvote() {
        return this.userIdDownvote;
    }
    public void addSubcomment(Comment comment) {
        this.subcomments.add(comment);
    }
    public void updateComment(String text, String userId) {
        if (this.commentId == userId) {
            this.comment = text;
        }
    }
    public void commentUpvoter(String userId) {
        if (this.userIdDownvote.contains(userId)) {
            this.userIdDownvote.remove(userId);
        }
        if (!this.userIdUpvote.contains(userId)) {
            this.userIdUpvote.add(userId);
        } else {
            this.userIdUpvote.remove(userId);
        }
    }
    public void commentDownvoter(String userId) {
        if (this.userIdUpvote.contains(userId)) {
            this.userIdUpvote.remove(userId);
        }
        if (!this.userIdDownvote.contains(userId)) {
            this.userIdDownvote.add(userId);
        } else {
            this.userIdDownvote.remove(userId);
        }
    }
    public ArrayList<Comment> getSubCommentList() {
        Collections.sort(this.subcomments, (c1, c2) -> (c2.getUserIdUpvote().size() - c2.getUserIdDownvote().size()) - (c1.getUserIdUpvote().size() - c1.getUserIdDownvote().size()));
        return this.subcomments;
    }
}