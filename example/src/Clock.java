public class Clock {
    protected static final int DAY_IN_SECONDS = 60 * 60 * 24;
    protected int seconds;

    public byte getHours() {
        int hours = this.seconds / 60 / 60;
        hours = hours % 12;
        return hours == 0 ? 12 : (byte) hours;
    }
    public byte getMinutes() {
        return (byte) (this.seconds / 60 % 60);
    }
    public byte getSeconds() {
        return (byte) (this.seconds % 60);
    }

    public void tick() {
        this.seconds = (this.seconds + 1) % DAY_IN_SECONDS;
    }
    public void mount() {
        // 벽에 시계를 검
    }
}
