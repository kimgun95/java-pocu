package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Blog {
    private String title;
    private ArrayList<Post> posts = new ArrayList<>();
    private HashSet<String> tagFilter = new HashSet<>();
    private ArrayList<User> authorFilter = new ArrayList<>();
    private PostSortingType sortingType = PostSortingType.CREATEDLATE;

    public Blog(String title) {
        this.title = title;
    }
    public void setTagFilter(HashSet<String> tags) {
        this.tagFilter = tags;
    }
    public void setAuthorFilter(ArrayList<User> authors) {
        this.authorFilter = authors;
    }
    public void setPostOrder(PostSortingType sortingType) {
        this.sortingType = sortingType;
    }
    public void addPost(Post post) {
        this.posts.add(post);
    }

    public ArrayList<Post> getPostList() {
        ArrayList<Post> resultPosts = new ArrayList<>();

        for (Post post : this.posts) {
            if (tagFilter.size() > 0 && !post.hasTag(tagFilter)) {
                continue;
            }
            if (authorFilter.size() > 0 && !post.hasAuthor(authorFilter)) {
                continue;
            }
            resultPosts.add(post);
        }

        if (sortingType == PostSortingType.CREATEDFAST) {
            Collections.sort(resultPosts, (p1, p2) -> p1.getCreatedDateTime().compareTo(p2.getCreatedDateTime()));
        } else if (sortingType == PostSortingType.MODIFIEDLATE) {
            Collections.sort(resultPosts, (p1, p2) -> p2.getModifiedDateTime().compareTo(p1.getModifiedDateTime()));
        } else if (sortingType == PostSortingType.MODIFIEDFAST) {
            Collections.sort(resultPosts, (p1, p2) -> p1.getModifiedDateTime().compareTo(p2.getModifiedDateTime()));
        } else if (sortingType == PostSortingType.POSTTITLE) {
            Collections.sort(resultPosts, (p1, p2) -> p1.getTitle().compareTo(p2.getTitle()));
        } else {
            Collections.sort(resultPosts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        }

        return resultPosts;
    }

}