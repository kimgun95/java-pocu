package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Blog {
    private ArrayList<Post> posts = new ArrayList<>();
    // 1.createdLate, 2.createdFast, 3.modifiedLate, 4.modifiedFast, 5.title
    private int sortingType = 1;

    public Blog() {

    }
    public void addPost(String title, String body, OffsetDateTime createdDatetime) {
        this.posts.add(new Post(title, body, createdDatetime));
    }
    public void getPostList() {
        if (sortingType == 1) {
            System.out.print(String.format("%d%s",sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.CreatedLate);
        }
        else if (sortingType == 2) {
            System.out.print(String.format("%d%s",sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.CreatedFast);
        }
        else {
            System.out.print(String.format("%d%s",sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.postTitle);
        }

        for (Post post : this.posts) {
            System.out.print(post.getTitle() + " " + post.getBody() + post.getOffsetDataTime() + System.lineSeparator());
        }
    }
    public void setPostOrder(int sortingType) {
        this.sortingType = sortingType;
    }
    public void updatePostTitle() {

    }
    public void updatePostBody() {

    }
    public void addPostTag(String tag) {

    }
    public void addPostComment() {

    }
}
