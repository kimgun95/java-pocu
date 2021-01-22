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
    public void addPost(Blog blog, Post post) {
        if (this.blog == blog) {
            blog.addPost(post, this.userId);
        } else {
            System.out.print("당신은 블로그 주인이 아닙니다.");
        }
    }
    public ArrayList<Post> getPostList(Blog blog) {
        return blog.getPostList();
    }
    public void setTag(Blog blog, String tag) {
        blog.setTag(tag);
    }
    public void setAuthor(Blog blog, String author) {
        blog.setAuthor(author);
    }
    public void setPostOrder(Blog blog, int sortingType) {
        blog.setPostOrder(sortingType);
    }
    public void updatePostBody(Post post, String body) {
        post.updatePostBody(body, this.userId);
    }
    public void updatePostTitle(Post post, String title) {
        post.updatePostTitle(title, this.userId);
    }
    public void addPostTag(Post post, String tag) {
        post.addPostTag(tag, this.userId);
    }
    public void addComment(Post post, Comment comment) {
        post.addComment(comment, this.userId);
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
    public void addSubcomment(Comment comment, Comment subComment) {
        comment.addSubcomment(subComment, this.userId);
    }
    public ArrayList<Comment> getSubCommentList(Comment comment) {
        return comment.getSubCommentList();
    }
    public void updateComment(Comment comment, String modified) {
        comment.updateComment(modified, this.userId);
    }
    public void addReaction(Post post, int reaction) {
        post.addReaction(reaction, this.userId);
    }
    public void removeReaction(Post post, int reaction) {
        post.removeReaction(reaction, this.userId);
    }
    public void subCommentUpvoter(Comment comment) {
        comment.commentUpvoter(this.userId);
    }
    public void subCommentDownvoter(Comment comment) {
        comment.commentDownvoter(this.userId);
    }
}