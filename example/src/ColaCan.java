import java.util.Comparator;

public class ColaCan {
    private static int numCreated;
    private int remainMl;

    public ColaCan() {
        ++numCreated;
    }
    public static void printStatus() {
        System.out.println("# Cola Produced: " + numCreated);
    }
}
