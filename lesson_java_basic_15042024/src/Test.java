public class Test {

    public static void main(String[] args) {

        Student kate = new Student();

        Student egor = new Student("egor");

        Student mike = new Student("Mike", 31, "B2021");

        System.out.println(kate.studentName);
        System.out.println(egor.studentName);
        System.out.println(mike.studentName + " " + mike.studentAge + " " + mike.studentGroup);
    }
}
