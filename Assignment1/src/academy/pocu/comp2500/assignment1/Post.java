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
    // public String getBody() {
        // return this.body;
    // }
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
        Collections.sort(this.comments, new Comparator<Comment>() {
            @Override
            public int compare(Comment comment, Comment commentId) {
                ArrayList<String> c1UserUpvote = comment.getUserIdUpvote();
                ArrayList<String> c1UserIdDownvote = comment.getUserIdDownvote();
                ArrayList<String> c2UserUpvote = commentId.getUserIdUpvote();
                ArrayList<String> c2UserIdDownvote = commentId.getUserIdDownvote();

                int c1Vote = c1UserUpvote.size() - c1UserIdDownvote.size();
                int c2Vote = c2UserUpvote.size() - c2UserIdDownvote.size();

                // System.out.print(String.format("%s%s", time2.compareTo(time1), System.lineSeparator()));
                return c2Vote - c1Vote;
            }
        });
        return this.comments;
    }
    public void addReaction(ReactionType reaction, String userId) {
        this.reaction.addReaction(reaction, userId);
    }
    public void removeReaction(ReactionType reaction, String userId) {
        this.reaction.removeReaction(reaction, userId);
    }
}