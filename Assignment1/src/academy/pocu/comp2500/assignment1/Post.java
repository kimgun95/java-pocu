package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Post {
    private String title;
    private String author;
    private String body;
    private OffsetDateTime createdDateTime;
    private OffsetDateTime modifiedDateTime;
    private ArrayList<String> tags = new ArrayList<>();
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(String title, String author, String body) {
        this.title = title;
        this.author = author;
        this.body = body;
        this.createdDateTime = OffsetDateTime.now();
        this.modifiedDateTime = OffsetDateTime.now();
    }
    public String getTitle() {
        return this.title;
    }
    public String getBody() {
        return this.body;
    }
    public OffsetDateTime getOffsetDataTime() {
        return this.createdDateTime;
    }
    public ArrayList<String> getTags() {
        return this.tags;
    }
    public String getAuthor() {
        return this.author;
    }
    public static Comparator<Post> CreatedLate = new Comparator<Post>() {
        @Override
        public int compare(Post p1, Post p2) {
            OffsetDateTime time1 = p1.getOffsetDataTime();
            OffsetDateTime time2 = p2.getOffsetDataTime();
            // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
            return time2.compareTo(time1);
        }
    };
    public static Comparator<Post> CreatedFast = new Comparator<Post>() {
        @Override
        public int compare(Post p1, Post p2) {
            OffsetDateTime time1 = p1.getOffsetDataTime();
            OffsetDateTime time2 = p2.getOffsetDataTime();

            return time1.compareTo(time2);
        }
    };
    public static Comparator<Post> postTitle = new Comparator<Post>() {
        @Override
        public int compare(Post p1, Post p2) {
            String title1 = p1.getTitle();
            String title2 = p2.getTitle();

            return title1.compareTo(title2);
        }
    };
    public void addPostTag(String tag) {
        this.tags.add(tag);
    }
    public void updatePostTitle(String title) {
        this.title = title;
        this.modifiedDateTime = OffsetDateTime.now();
    }
    public void updatePostBody(String body) {
        this.body = body;
        this.modifiedDateTime = OffsetDateTime.now();
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}
