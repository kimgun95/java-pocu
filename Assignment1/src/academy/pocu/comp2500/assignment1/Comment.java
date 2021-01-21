package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Comment {
    private String comment;
    private ArrayList<Comment> comments = new ArrayList();
    private ArrayList<String> userIdUpvote = new ArrayList<>();
    private ArrayList<String> userIdDownvote = new ArrayList<>();

    public Comment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return this.comment;
    }
    public ArrayList<String> getUserIdUpvote() {
        return this.userIdUpvote;
    }
    public ArrayList<String> getUserIdDownvote() {
        return this.userIdDownvote;
    }
    public void addSubcomment(Comment comment) {
        this.comments.add(comment);
    }
    public void updateComment(String comment) {
        this.comment = comment;
    }
    public ArrayList<Comment> getCommentList() {
        for (Comment comment : this.comments) {
            System.out.print(comment.getComment() + System.lineSeparator());
        }
        return this.comments;
    }
    public void commentUpvoter(String userId) {
        if (this.userIdDownvote.contains(userId)) {
            this.userIdDownvote.remove(userId);
        }
        if (!this.userIdUpvote.contains(userId)) {
            this.userIdUpvote.add(userId);
        }
//        for (String id : this.userIdUpvote) {
//            System.out.print(id + System.lineSeparator());
//        }
    }
    public void commentDownvoter(String userId) {
        if (this.userIdUpvote.contains(userId)) {
            this.userIdUpvote.remove(userId);
        }
        if (!this.userIdDownvote.contains(userId)) {
            this.userIdDownvote.add(userId);
        }
//        for (String id : this.userIdUpvote) {
//            System.out.print(id + System.lineSeparator());
//        }
//        for (String id : this.userIdDownvote) {
//            System.out.print(id + System.lineSeparator());
//        }
    }
    public static Comparator<Comment> TopVoted = new Comparator<Comment>() {
        @Override
        public int compare(Comment c1, Comment c2) {
            ArrayList<String> c1UserUpvote = c1.getUserIdUpvote();
            ArrayList<String> c1UserIdDownvote = c1.getUserIdDownvote();
            ArrayList<String> c2UserUpvote = c2.getUserIdUpvote();
            ArrayList<String> c2UserIdDownvote = c2.getUserIdDownvote();

            int c1Vote = c1UserUpvote.size() - c1UserIdDownvote.size();
            int c2Vote = c2UserUpvote.size() - c2UserIdDownvote.size();

            // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
            return c2Vote - c1Vote;
        }
    };
}
