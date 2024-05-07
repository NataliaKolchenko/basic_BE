package Student;

import Student.Student;

public class StudentArrayClass {

    public static void main(String[] args) {

        Student[] students = new Student[] {
                new Student("Alex"),
                new Student("Ivan"),
                new Student("Petr")
        };

        System.out.println("Length array: " + students.length);
        System.out.println("Students: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
