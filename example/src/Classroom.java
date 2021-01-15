public class Classroom {
    private int[] scores;
    private float mean;

    public boolean setScore(int index, int score) {
        scores[index] = score;
        updateMean();

        return true;
    }
    private void updateMean() {

    }
}
