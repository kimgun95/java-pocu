public final class Robot {
    private Head head;
    private int hp;
    public Robot(int hp, Head head) {
        this.hp = hp;
        this.head = head;
    }
    public Head getHead() {
        return head;
    }
    public void setHead(Head head) {
        this.head = head;
    }
}
