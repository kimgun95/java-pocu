package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.*;

public class Post {
    private String title;
    private String body;
    private HashSet<String> tags = new HashSet<>();
    private User author;
    private OffsetDateTime createdDateTime;
    private OffsetDateTime modifiedDateTime;
    private ArrayList<Comment> comments = new ArrayList<>();
    private HashMap<ReactionType, ArrayList<User>> reactions = new HashMap<>();

    public Post(String title, String body, User user) {
        this.title = title;
        this.author = user;
        this.body = body;
        this.createdDateTime = OffsetDateTime.now();
        this.modifiedDateTime = this.createdDateTime;

        for (ReactionType reaction : ReactionType.values()) {
            this.reactions.put(reaction, new ArrayList<>());
        }
    }
    public boolean setTitle(User author, String title) {
        if (this.author != author) {
            return false;
        }
        this.title = title;
        updateModifiedDateTime();
        return true;
    }
    public boolean setBody(User author, String body) {
        if (this.author != author) {
            return false;
        }
        this.body = body;
        updateModifiedDateTime();
        return true;
    }
    public void addTag(String tag) {
        this.tags.add(tag);
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
    public ArrayList<Comment> getComments() {
        return this.comments;
    }
    public boolean addReaction(User user, ReactionType reactionType) {
        ArrayList<User> users = this.reactions.get(reactionType);
        if (users.contains(user)) {
            return false;
        }
        users.add(user);
//        this.reactions.put(reactionType, users);
        return true;
    }
    public boolean removeReaction(User user, ReactionType reactionType) {
        ArrayList<User> users = this.reactions.get(reactionType);
        if (!users.contains(user)) {
            return false;
        }
        users.remove(user);
        return true;
    }
    public boolean hasTag(HashSet<String> tags) {
        for (String tag : tags) {
            if (this.tags.contains(tag)) {
                return true;
            }
        }
        return false;
    }
    public boolean hasAuthor(ArrayList<User> authors) {
        for (User author : authors) {
            if (this.author == author) {
                return true;
            }
        }
        return false;
    }
    private void updateModifiedDateTime() {
        this.modifiedDateTime = OffsetDateTime.now();
    }
}