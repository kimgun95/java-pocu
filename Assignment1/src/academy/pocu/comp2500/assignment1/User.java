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
        return this.blog = new Blog();
    }
    public String getUserId() {
        return this.userId;
    }
    public void addPost(Post post) {
        this.blog.addPost(post);
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
        post.updatePostBody(body);
    }

    public void updatePostTitle(Post post, String title) {
        post.updatePostTitle(title);
    }

    public void addPostTag(Post post, String tag) {
        post.addPostTag(tag);
    }
    public void addComment(Post post, Comment comment) {
        post.addComment(comment);
    }

    public ArrayList<Comment> getCommentList(Post post) {
        return post.getCommentList();
    }
    public void commentUpvoter(Comment comment, String userId) {
        comment.commentUpvoter(userId);
    }
    public void commentDownvoter(Comment comment, String userId) {
        comment.commentDownvoter(userId);
    }
}
