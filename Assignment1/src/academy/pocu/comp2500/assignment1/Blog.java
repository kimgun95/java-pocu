package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collections;



public class Blog {
    private ArrayList<Post> posts = new ArrayList<>();
    private String tag;
    private String author;
    private String blogId;
    private Sorting sortingType;

    public Blog(String userId) {
        this.sortingType = Sorting.CREATEDLATE;
        this.tag = null;
        this.author = null;
        this.blogId = userId;
    }
    public void addPost(Post post, String userId) {
        if (post.getPostId() == userId) {
            this.posts.add(post);
        } else {
            System.out.print("당신의 글이 아닙니다.");
        }
    }
    public ArrayList<Post> getPostList() {
        if (sortingType == Sorting.CREATEDFAST) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.CreatedFast);
        } else if (sortingType == Sorting.MODIFIEDLATE) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.ModifiedLate);
        } else if (sortingType == Sorting.MODIFIEDFAST) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.ModifiedFast);
        } else if (sortingType == Sorting.POSTTITLE) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.postTitle);
        } else {
            Collections.sort(this.posts, Post.CreatedLate);
        }

        ArrayList<Post> returnPost = new ArrayList<>();

        for (Post post : this.posts) {
            if (this.tag == null && this.author == null) {
                returnPost.add(post);
                // System.out.print(post.getBody() + System.lineSeparator());
            } else if (this.author == null) {
                for (String tag : post.getTags()) {
                    if (tag == this.tag) {
                        returnPost.add(post);
                        // System.out.print(post.getBody() + System.lineSeparator());
                    }
                }
            } else if (this.tag == null) {
                if (post.getAuthor() == this.author) {
                    returnPost.add(post);
                    // System.out.print(post.getBody() + System.lineSeparator());
                }
            } else {
                System.out.print("필터 쪽 에러입니다.");
            }
        }
        return returnPost;
    }
    public void setPostOrder(Sorting sortingType) {
        this.sortingType = sortingType;
    }
    public void setTag(String tag) {
        if (this.author != null) {
            this.author = null;
        }
        this.tag = tag;
    }
    public void setAuthor(String author) {
        if (this.tag != null) {
            this.tag = null;
        }
        this.author = author;
    }
}