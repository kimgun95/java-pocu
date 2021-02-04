public class DigitalClock extends Clock {
    public boolean isBeforeMidday() {
        return (super.seconds / (DAY_IN_SECONDS / 2) == 0);
    }
    public void setIsBeforeMidday(boolean isAm) {
//        super.seconds의 값을 AM or PM으로 변경
    }
    public void setHours(byte hours) {
//        super.seconds에서 시에 해당하는 부분을 hours로 변경
    }
    public void setMinutes(byte minutes) {
//        super.seconds에서 분에 해당하는 부분을 minutes로 변경
    }
    public void setSeconds(byte seconds) {
//        super.seconds에서 초에 해당하는 부분을 seconds로 변경
    }
    public void setTime(byte hours, byte minutes, byte seconds, boolean isAm) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        setIsBeforeMidday(isAm);
    }
}
