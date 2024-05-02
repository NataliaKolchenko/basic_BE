public class Student {

    String studentName;
    int studentAge;
    String studentGroup;

    public Student () {

    }

    public Student (String studentName) {
        this.studentName = studentName;
    }

    public Student (int studentAge) {
        this.studentAge = studentAge;
    }

    public Student (String studentName, int studentAge, String studentGroup) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGroup = studentGroup;
    }
}
