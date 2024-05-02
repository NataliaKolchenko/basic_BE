import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparing {
    public static void main(String[] args) {
        Dog dog1 = new Dog(13, "Tom");
        Dog dog2 = new Dog(7, "Bill");
        Dog dog3 = new Dog(15, "Gustav");
        Dog dog4 = new Dog(5, "Georg");
        Dog dog5 = new Dog(10, "Watson");
        Dog dog6 = new Dog(1, "Pitt");
        Dog dog7 = new Dog(1, "Bett");
        Dog dog8 = new Dog(8, "Marta");
        Dog dog9 = new Dog(9, "Musya");


//        System.out.println(comparingDogs(dog1, dog2));
//        System.out.println(comparingDogs(dog1, null));

//        System.out.println(youngestDog(dog1, dog2, dog3).getName());

//        getYoungestDogName(dog1, dog2, dog3, dog4, dog5, dog6, dog7, dog8, dog9)
//                .stream()
//                .map(x -> x.getName())
//                .forEach(System.out::println);

        var youngestDogName = getYoungestDogName(dog1, dog2, dog3, dog4, dog5, dog6, dog7, dog8, dog9);
        for (Dog g : youngestDogName) {
            System.out.println(g.getName());
        }

    }

    public static int comparingDogs(Dog dog1, Dog dog2) {
        //вернуть -1 есом первая собака младше
        //1 если первая собака старше
        //0 если собаки равны
        //-2 если одна из собак null

        if (dog1 == null || dog2 == null) {
            return -2;
        } else if (dog1.getAge() > dog2.getAge()) {
            return 1;
        } else if (dog1.getAge() == dog2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static Dog youngestDog(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1 == null || dog2 == null || dog3 == null) {
            return null;
        }

        if (dog1.getAge() <= dog2.getAge() && dog1.getAge() <= dog3.getAge()) {
            return dog1;
        }
        if (dog2.getAge() <= dog1.getAge() && dog2.getAge() <= dog3.getAge()) {
            return dog2;
        }
        return dog3;

    }

//    public static List<Dog> getYoungestDogName(Dog... dogs) {
//
//        List list = new ArrayList();
//
//        if (dogs.length == 0) {
//            return null;
//        } else if (dogs.length == 1) {
//            return Arrays.asList(dogs);
//        } else {
//            Dog youngestDog = dogs[0];
//            for (int i = 1; i < dogs.length; i++) {
//                if (dogs[i].getAge() < youngestDog.getAge()) {
//                    youngestDog = dogs[i];
//                }
//            }
//
//            for (int a = 0; a < dogs.length; a++) {
//                if (youngestDog.getAge() == dogs[a].getAge()) {
//                    list.add(dogs[a]);
//                }
//            }
//        }
//        return list;
//    }

    public static List<Dog> getYoungestDogName(Dog... dogs) {

        List<Dog> list = new ArrayList();

        if (dogs.length == 0) {
            return null;
        } else if (dogs.length == 1) {
            return Arrays.asList(dogs);
        } else {
            //Dog youngestDog = dogs[0];
            list.add(dogs[0]);
            for (int i = 0; i < dogs.length; i++) {
                if (dogs[i].getAge() < list.get(0).getAge()) {
                    //youngestDog = dogs[i];
                    list.clear();
                    list.add(dogs[i]);
                }else if (list.get(0).getAge() == dogs[i].getAge()) {
                    list.add(dogs[i]);
                }
            }

        }

        return list;

    }

}
