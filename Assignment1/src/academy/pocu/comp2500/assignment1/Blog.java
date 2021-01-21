package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Blog {
    private ArrayList<Post> posts = new ArrayList<>();
    // 1.createdLate, 2.createdFast, 3.modifiedLate, 4.modifiedFast, 5.title
    private int sortingType;
    private String tag;
    private String author;

    public Blog() {
        this.sortingType = 1;
        this.tag = null;
        this.author = null;
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public ArrayList<Post> getPostList() {
        if (sortingType == 1) {
            System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.CreatedLate);
        } else if (sortingType == 2) {
            System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.CreatedFast);
        } else if (sortingType == 3) {
            System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.ModifiedLate);
        } else if (sortingType == 4) {
            System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.ModifiedFast);
        }else {
            System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, Post.postTitle);
        }

        ArrayList<Post> returnPost = new ArrayList<>();

        for (Post post : this.posts) {
            if (this.tag == null && this.author == null) {
                returnPost.add(post);
                System.out.print(post.getBody() + System.lineSeparator());
            } else if (this.author == null) {
                for (String tag : post.getTags()) {
                    if (tag == this.tag) {
                        returnPost.add(post);
                        System.out.print(post.getBody() + System.lineSeparator());
                    }
                }
            } else if (this.tag == null) {
                if (post.getAuthor() == this.author) {
                    returnPost.add(post);
                    System.out.print(post.getBody() + System.lineSeparator());
                }
            } else {
                System.out.print("필터는 한가지만 적용이 됩니다");
            }
        }
        return returnPost;
    }

    public void setPostOrder(int sortingType) {
        this.sortingType = sortingType;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getTag() {
        return this.tag;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }



}
