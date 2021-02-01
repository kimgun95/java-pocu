

public class Main {
    public static void main(String[] args) {
        Student student = new Student("yeon", "tae");
        Person person = student;

        Student actuallyStudent = (Student) person;
    }

    PartTimeTeacher partTimeTeacher =
            new PartTimeTeacher("woo", "min", Department.COMPUTER_SCIENCE, 10);
    Teacher teacher = partTimeTeacher;
    Person person = partTimeTeacher;

    Person person = new Person("gu", "kim");
    Student student = person;

    Person person0 = new Student("Leon", "kim");
    Person person1= new Teacher("Leon", "kim", Department.COMPUTER_SCIENCE);

    Teacher teacher = null;
    if (person0 instanceof Teacher) {
        teacher = (Teacher) person0;
    }
    if (person1 instanceof Teacher) {
        teacher = (Teacher) person1;
    }

    FullTimeTeacher teacher = new FullTimeTeacher("Leon", "kim", Department.COMPUTER_SCIENCE);
    Class c = teacher.getClass();
}
