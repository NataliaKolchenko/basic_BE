package Dog;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class Dog {

    private String name;
    private int age;


    public Dog (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public String toString () {
//        return this.name + " is " + this.age + " years";
//    }

//    @Override
//    public boolean equals (Objects obj) {
//
//        return Objects.equals(obj1.age, this) && Objects.equals(obj1.name, this.name);
//    }




}
