public class WaterSpray {
    private SprayHead head;
    private SprayBottle body;

    public WaterSpray(SprayHead head, SprayBottle body) {
        this.head = head;
        this.body = body;
    }
    public SprayHead getHead() {
        return this.head = head;
    }
    public void setHead(SprayHead head) {
        this.head = head;
    }
    public SprayBottle getBody() {
        return this.body;
    }
    public void setBody(SprayBottle body) {
        this.body = body;
    }
}
