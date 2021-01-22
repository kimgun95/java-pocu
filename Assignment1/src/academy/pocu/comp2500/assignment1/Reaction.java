package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Reaction {
    private ArrayList<String> great;
    private ArrayList<String> sad;
    private ArrayList<String> angry;
    private ArrayList<String> fun;
    private ArrayList<String> love;

    public Reaction() {
        this.great = new ArrayList<>();
        this.sad = new ArrayList<>();
        this.angry = new ArrayList<>();
        this.fun = new ArrayList<>();
        this.love = new ArrayList<>();
    }
    public void addReaction(int reaction, String userId) {
        if (reaction == 1) {
            updateReaction(this.great, userId, 1);
        } else if (reaction == 2) {
            updateReaction(this.sad, userId, 1);
        } else if (reaction == 3) {
            updateReaction(this.angry, userId, 1);
        } else if (reaction == 4) {
            updateReaction(this.fun, userId, 1);
        } else if (reaction == 5) {
            updateReaction(this.love, userId, 1);
        } else {
            System.out.print("존재하지 않는 리액션입니다.");
        }
    }
    public void removeReaction(int reaction, String userId) {
        if (reaction == 1) {
            updateReaction(this.great, userId, 0);
        } else if (reaction == 2) {
            updateReaction(this.sad, userId, 0);
        } else if (reaction == 3) {
            updateReaction(this.angry, userId, 0);
        } else if (reaction == 4) {
            updateReaction(this.fun, userId, 0);
        } else if (reaction == 5) {
            updateReaction(this.love, userId, 0);
        } else {
            System.out.print("존재하지 않는 리액션입니다.");
        }
    }
    private void updateReaction(ArrayList<String> reaction, String userId, int  reactionId) {
        if (reactionId == 1) {
            if (!reaction.contains(userId)) {
                reaction.add(userId);
            }
        } else {
            if (reaction.contains(userId)) {
                reaction.remove(userId);
            }
        }
        // for (String id : reaction) {
        //     System.out.print(id + System.lineSeparator());
        // }
    }
}
