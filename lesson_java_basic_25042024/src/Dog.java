import java.util.concurrent.atomic.AtomicReference;

public class Dog {

    private int age;
    private String name;



    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public boolean hasName () {
        //1 version
        if (name == null) {
            return false;
        }
            return true;

        //2 version
//        return name != null;

    }
}
