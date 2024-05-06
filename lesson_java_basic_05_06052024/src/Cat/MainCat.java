package Cat;

import Cat.Cat;

public class MainCat {

    public static void main(String[] args) {

        Cat catTom = new Cat("Tom");
        System.out.println(catTom.getNumberOfPet());
        catTom.petCat();
        catTom.petCat();
        catTom.petCat();
        catTom.petCat();
        System.out.println(catTom.getNumberOfPet());


    }
}
