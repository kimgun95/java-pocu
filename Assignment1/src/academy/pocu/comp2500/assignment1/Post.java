package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Post {
    private String title;
    private String body;
    private OffsetDateTime createdDatetime;
    private String tag = new String();

    public Post(String title, String body, OffsetDateTime createdDatetime) {
        this.title = title;
        this.body = body;
        this.createdDatetime = createdDatetime;
    }
    public String getTitle() {
        return this.title;
    }
    public String getBody() {
        return this.body;
    }
    public OffsetDateTime getOffsetDataTime() {
        return this.createdDatetime;
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

}
