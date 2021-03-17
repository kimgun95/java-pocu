public final class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private int yearStarted;
    private int age;

    public Employee(CreateEmployeeParams params) {
        this.firstName = params.firstName;
        this.lastName = params.lastName;
        this.id = params.id;
        this.yearStarted = params.yearStarted;
        this.age = params.age;
    }
}
