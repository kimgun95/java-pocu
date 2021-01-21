package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Comment {
    private String comment;
    private ArrayList<Comment> comments = new ArrayList();

    public Comment(String comment) {
        this.comment = comment;
    }
    public void addSubcomment(Comment comment) {
        this.comments.add(comment);
    }
    public void updateComment(String comment) {
        this.comment = comment;
    }
}
