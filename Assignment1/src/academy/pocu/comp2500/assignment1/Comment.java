package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Comment {
    private String content;
    private User author;
    private ArrayList<Comment> subcomments = new ArrayList<>();
    private ArrayList<User> userUpvote = new ArrayList<>();
    private ArrayList<User> userDownvote = new ArrayList<>();


    public Comment(String content, User author) {
        this.content = content;
        this.author = author;
    }
    public boolean setContent(User author, String content) {
        if (this.author != author) {
            return false;
        }
        this.content = content;
        return true;
    }
    public void addSubcomment(Comment subComment) {
        this.subcomments.add(subComment);
    }
    public ArrayList<Comment> getSubcomments() {
        return sortByVoteCount(this.subcomments);
    }
    public boolean addUpVoter(User user) {
        if (this.userUpvote.contains(user)) {
            return false;
        }
        this.userUpvote.add(user);
        return true;
    }
    public boolean addDownVoter(User user) {
        if (this.userDownvote.contains(user)) {
            return false;
        }
        this.userDownvote.add(user);
        return true;
    }
    public static ArrayList<Comment> sortByVoteCount(ArrayList<Comment> comments) {
        ArrayList<Comment> resultSubcomments = new ArrayList<>(comments);
        Collections.sort(resultSubcomments, (c1, c2) -> (c2.userUpvote.size() - c2.userDownvote.size()) - (c1.userUpvote.size() - c1.userDownvote.size()));
        return resultSubcomments;
    }
}