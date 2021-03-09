public class Robot implements Cloneable{
    private Head head = new Head();
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

Robot robot = new Robot();
Robot savePoint = (Robot) robot.clone();