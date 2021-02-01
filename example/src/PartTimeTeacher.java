public class PartTimeTeacher extends Teacher {
    private int weeklyHours;
    public PartTimeTeacher(String firstName, String lastName, Department department) {
        this(firstName, lastName, department);
    }
    public PartTimeTeacher(String firstName, String lastName, Department department, int hours) {
        super(firstName, lastName, department);

        this.weeklyHours = hours;
    }
    public int getWeeklyHours() {
        return this.weeklyHours;
    }
    public void setWeeklyHours(int hours) {
        this.weeklyHours = hours;
    }
}
