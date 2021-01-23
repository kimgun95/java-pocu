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
    public void addReaction(ReactionType reaction, String userId) {
        if (reaction == ReactionType.GREAT) {
            updateReaction(this.great, userId, "1");
        } else if (reaction == ReactionType.SAD) {
            updateReaction(this.sad, userId, "1");
        } else if (reaction == ReactionType.ANGRY) {
            updateReaction(this.angry, userId, "1");
        } else if (reaction == ReactionType.FUN) {
            updateReaction(this.fun, userId, "1");
        } else if (reaction == ReactionType.LOVE) {
            updateReaction(this.love, userId, "1");
        } else {
            System.out.print("존재하지 않는 리액션입니다.");
        }
    }
    public void removeReaction(ReactionType reaction, String userId) {
        if (reaction == ReactionType.GREAT) {
            updateReaction(this.great, userId, "0");
        } else if (reaction == ReactionType.SAD) {
            updateReaction(this.sad, userId, "0");
        } else if (reaction == ReactionType.ANGRY) {
            updateReaction(this.angry, userId, "0");
        } else if (reaction == ReactionType.FUN) {
            updateReaction(this.fun, userId, "0");
        } else if (reaction == ReactionType.LOVE) {
            updateReaction(this.love, userId, "0");
        } else {
            System.out.print("존재하지 않는 리액션입니다.");
        }
    }
    private void updateReaction(ArrayList<String> emojiId, String userId, String reactionId) {
        if (reactionId == "1") {
            if (!emojiId.contains(userId)) {
                emojiId.add(userId);
            }
        } else {
            if (emojiId.contains(userId)) {
                emojiId.remove(userId);
            }
        }
        // for (String id : reaction) {
        //     System.out.print(id + System.lineSeparator());
        // }
    }
}
