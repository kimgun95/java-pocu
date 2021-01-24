package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class User {
    private String userId;
    private Blog blog;

    public User(String userId) {
        this.userId = userId;
    }
    public Blog createBlog() {
        return this.blog = new Blog(this.userId);
    }
    public String getUserId() {
        return this.userId;
    }
    public ArrayList<Comment> getCommentList(Post post) {
        return post.getCommentList();
    }
    public void commentUpvoter(Comment comment) {
        comment.commentUpvoter(this.userId);
    }
    public void commentDownvoter(Comment comment) {
        comment.commentDownvoter(this.userId);
    }
    public ArrayList<Comment> getSubCommentList(Comment comment) {
        return comment.getSubCommentList();
    }
    public void addReaction(Post post, ReactionType reaction) {
        post.addReaction(reaction, this.userId);
    }
    public void removeReaction(Post post, ReactionType reaction) {
        post.removeReaction(reaction, this.userId);
    }
    public void subCommentUpvoter(Comment comment) {
        comment.commentUpvoter(this.userId);
    }
    public void subCommentDownvoter(Comment comment) {
        comment.commentDownvoter(this.userId);
    }
}