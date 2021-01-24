package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Blog {
    private ArrayList<Post> posts;
    private String tag;
    private String author;
    private String blogId;
    private Sorting sortingType;

    public Blog(String userId) {
        this.sortingType = Sorting.CREATEDLATE;
        this.tag = null;
        this.author = null;
        this.blogId = userId;
        this.posts = new ArrayList<>();
    }
    public void addPost(Post post) {
        this.posts.add(post);
    }
    public ArrayList<Post> getPostList() {
        if (sortingType == Sorting.CREATEDFAST) {
            Collections.sort(this.posts, (p1, p2) -> p1.getCreatedDateTime().compareTo(p2.getCreatedDateTime()));
        } else if (sortingType == Sorting.MODIFIEDLATE) {
            Collections.sort(this.posts, (p1, p2) -> p2.getModifiedDateTime().compareTo(p1.getModifiedDateTime()));
        } else if (sortingType == Sorting.MODIFIEDFAST) {
            Collections.sort(this.posts, (p1, p2) -> p1.getModifiedDateTime().compareTo(p2.getModifiedDateTime()));
        } else if (sortingType == Sorting.POSTTITLE) {
            Collections.sort(this.posts, (p1, p2) -> p1.getTitle().compareTo(p2.getTitle()));
        } else {
            Collections.sort(this.posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        }

//        ArrayList<Post> returnPost = new ArrayList<>();
//
//        for (Post post : this.posts) {
//            if (this.tag == null && this.author == null) {
//                returnPost.add(post);
//                // System.out.print(post.getBody() + System.lineSeparator());
//            } else if (this.author == null) {
//                for (String tag : post.getTags()) {
//                    if (tag == this.tag) {
//                        returnPost.add(post);
//                        // System.out.print(post.getBody() + System.lineSeparator());
//                    }
//                }
//            } else if (this.tag == null) {
//                if (post.getAuthor() == this.author) {
//                    returnPost.add(post);
//                    // System.out.print(post.getBody() + System.lineSeparator());
//                }
//            } else {
//                System.out.print("필터 쪽 에러입니다.");
//            }
//        }
        return this.posts;
    }
    public void updatePostBody(Post post, String body, String userId) {
        post.updatePostBody(body, userId);
    }
    public void updatePostTitle(Post post, String title, String userId) {
        post.updatePostTitle(title, userId);
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