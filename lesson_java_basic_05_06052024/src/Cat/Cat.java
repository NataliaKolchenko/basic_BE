package Cat;

import java.security.PublicKey;

public class Cat {

    private String  name;
    private int age;
    private String kind;
    private String color;
    private int numberOfPet;

    public int getNumberOfPet() {
        return numberOfPet;
    }



    public Cat (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int petCat () {
        return numberOfPet +=1;
    }

}
