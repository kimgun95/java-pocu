package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    public void addPost(Post post) {
        this.posts.add(post);
    }
    public ArrayList<Post> getPostList() {
        if (sortingType == Sorting.CREATEDFAST) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, new Comparator<Post>() {
                @Override
                public int compare(Post post, Post postId) {
                    OffsetDateTime time1 = post.getCreatedDateTime();
                    OffsetDateTime time2 = postId.getCreatedDateTime();

                    return time1.compareTo(time2);
                }
            });
        } else if (sortingType == Sorting.MODIFIEDLATE) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, new Comparator<Post>() {
                @Override
                public int compare(Post post, Post postId) {
                    OffsetDateTime time1 = post.getModifiedDateTime();
                    OffsetDateTime time2 = postId.getModifiedDateTime();
                    // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
                    return time2.compareTo(time1);
                }
            });
        } else if (sortingType == Sorting.MODIFIEDFAST) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, new Comparator<Post>() {
                @Override
                public int compare(Post post, Post postId) {
                    OffsetDateTime time1 = post.getModifiedDateTime();
                    OffsetDateTime time2 = postId.getModifiedDateTime();
                    // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
                    return time1.compareTo(time2);
                }
            });
        } else if (sortingType == Sorting.POSTTITLE) {
            // System.out.print(String.format("%d%s", sortingType, System.lineSeparator()));
            Collections.sort(this.posts, new Comparator<Post>() {
                @Override
                public int compare(Post post, Post postId) {
                    String title1 = post.getTitle();
                    String title2 = postId.getTitle();

                    return title1.compareTo(title2);
                }
            });
        } else {
            Collections.sort(this.posts, new Comparator<Post>() {
                @Override
                public int compare(Post post, Post postId) {
                    OffsetDateTime time1 = post.getCreatedDateTime();
                    OffsetDateTime time2 = postId.getCreatedDateTime();
                    // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
                    return time2.compareTo(time1);
                }
            });
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