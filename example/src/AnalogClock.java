public class AnalogClock extends Clock {
    public short getSecondHandAngle() {
        return (short) (getSeconds() * 6);
    }
    public short getMinuteHandAngle() {
        return (short) (getMinutes() * 6);
    }
    public short getHourHandAngle() {
        final int ANGLE_PER_HOUR = 360 / 12;

        int hours = getHours() % 12;
        return (short) (hours * ANGLE_PER_HOUR + getMinutes() * ANGLE_PER_HOUR / 60);
    }
    public void addSeconds(short seconds) {
        int value = this.seconds + seconds;
        while (value < 0) {
            value += DAY_IN_SECONDS;
        }
        this.seconds = value % DAY_IN_SECONDS;
    }
}
