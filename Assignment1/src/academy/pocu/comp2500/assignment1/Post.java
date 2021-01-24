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
    private ArrayList<String> tags;
    private ArrayList<Comment> comments;
    private String postId;
    private Reaction reaction;

    public Post(String title, String body, String userId) {
        this.title = title;
        this.author = userId;
        this.body = body;
        this.createdDateTime = OffsetDateTime.now();
        this.modifiedDateTime = OffsetDateTime.now();
        this.postId = userId;
        this.tags = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.reaction = new Reaction();
    }
    public String getBody() {
        return this.body;
    }
    public String getPostId() {
        return this.postId;
    }
    public String getTitle() {
        return this.title;
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

    public void addPostTag(String tag, String userId) {
        if (this.postId == userId) {
            this.tags.add(tag);
        }
    }
    public void updatePostTitle(String title, String userId) {
        if (this.postId == userId) {
            this.title = title;
            this.modifiedDateTime = OffsetDateTime.now();
        }
    }
    public void updatePostBody(String body, String userId) {
        if (this.postId == userId) {
            this.body = body;
            this.modifiedDateTime = OffsetDateTime.now();
        }
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
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