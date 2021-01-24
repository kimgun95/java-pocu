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
        Collections.sort(this.subcomments, new Comparator<Comment>() {
            @Override
            public int compare(Comment comment, Comment commentId) {
                ArrayList<String> c1UserUpvote = comment.getUserIdUpvote();
                ArrayList<String> c1UserIdDownvote = comment.getUserIdDownvote();
                ArrayList<String> c2UserUpvote = commentId.getUserIdUpvote();
                ArrayList<String> c2UserIdDownvote = commentId.getUserIdDownvote();

                int c1Vote = c1UserUpvote.size() - c1UserIdDownvote.size();
                int c2Vote = c2UserUpvote.size() - c2UserIdDownvote.size();

                // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
                return c2Vote - c1Vote;
            }
        });
        return this.subcomments;
    }
}