package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Post {
    private String title;
    private String author;
    private String body;
    private OffsetDateTime createdDateTime;
    private OffsetDateTime modifiedDateTime;
    private ArrayList<String> tags = new ArrayList<>();
    private ArrayList<Comment> comments = new ArrayList<>();
    private String postId;
    private Reaction reaction = new Reaction();

    public Post(String title, String author, String body, String userId) {
        this.title = title;
        this.author = author;
        this.body = body;
        this.createdDateTime = OffsetDateTime.now();
        this.modifiedDateTime = OffsetDateTime.now();
        this.postId = userId;
    }
    public String getPostId() {
        return this.postId;
    }
    public String getTitle() {
        return this.title;
    }
    public String getBody() {
        return this.body;
    }
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    public ArrayList<String> getTags() {
        return this.tags;
    }
    public String getAuthor() {
        return this.author;
    }
    public static Comparator<Post> CreatedLate = new Comparator<Post>() {
        @Override
        public int compare(Post post, Post postId) {
            OffsetDateTime time1 = post.getCreatedDateTime();
            OffsetDateTime time2 = postId.getCreatedDateTime();
            // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
            return time2.compareTo(time1);
        }
    };
    public static Comparator<Post> CreatedFast = new Comparator<Post>() {
        @Override
        public int compare(Post post, Post postId) {
            OffsetDateTime time1 = post.getCreatedDateTime();
            OffsetDateTime time2 = postId.getCreatedDateTime();

            return time1.compareTo(time2);
        }
    };
    public static Comparator<Post> ModifiedLate = new Comparator<Post>() {
        @Override
        public int compare(Post post, Post postId) {
            OffsetDateTime time1 = post.getModifiedDateTime();
            OffsetDateTime time2 = postId.getModifiedDateTime();
            // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
            return time2.compareTo(time1);
        }
    };
    public static Comparator<Post> ModifiedFast = new Comparator<Post>() {
        @Override
        public int compare(Post post, Post postId) {
            OffsetDateTime time1 = post.getModifiedDateTime();
            OffsetDateTime time2 = postId.getModifiedDateTime();
            // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
            return time1.compareTo(time2);
        }
    };
    public static Comparator<Post> postTitle = new Comparator<Post>() {
        @Override
        public int compare(Post post, Post postId) {
            String title1 = post.getTitle();
            String title2 = postId.getTitle();

            return title1.compareTo(title2);
        }
    };
    public void addPostTag(String tag, String userId) {
        if (this.postId == userId) {
            this.tags.add(tag);
        } else {
            System.out.print("당신은 글의 주인이 아닙니다.");
        }
    }
    public void updatePostTitle(String title, String userId) {
        if (this.postId == userId) {
            this.title = title;
            this.modifiedDateTime = OffsetDateTime.now();
        } else {
            System.out.print("당신은 글의 주인이 아닙니다.");
        }
    }
    public void updatePostBody(String body, String userId) {
        if (this.postId == userId) {
            this.body = body;
            this.modifiedDateTime = OffsetDateTime.now();
        } else {
            System.out.print("당신은 글의 주인이 아닙니다.");
        }
    }
    public void addComment(Comment comment, String userId) {
        if (comment.getCommentId() == userId) {
            this.comments.add(comment);
        } else {
            System.out.print("당신은 댓글의 주인이 아닙니다.");
        }
    }
    public ArrayList<Comment> getCommentList() {
        Collections.sort(this.comments, Comment.TopVoted);
         // for (Comment comment : this.comments) {
         //     System.out.print(comment.getComment() + System.lineSeparator());
         // }
        return this.comments;
    }
    public void addReaction(ReactionType reaction, String userId) {
        this.reaction.addReaction(reaction, userId);
    }
    public void removeReaction(ReactionType reaction, String userId) {
        this.reaction.removeReaction(reaction, userId);
    }
}