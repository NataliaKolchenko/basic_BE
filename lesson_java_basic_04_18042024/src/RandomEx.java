import java.util.Random;

public class RandomEx {

    public static void main(String[] args) {
//        Random random = new Random();
//        int upperBoud = 11;
//        int randomNum = random.nextInt(upperBoud); //from 0 to upperBoud
//        int newRandomNum = 5 + random.nextInt(upperBoud); //from 5 to 10
//
//        System.out.println("random number " + randomNum);
//        System.out.println(newRandomNum);
//
//        float randomfloat = random.nextFloat(); //from 0.0 to 1.0 (not include)
//        double randomDouble = random.nextDouble();
//
//        System.out.println(randomfloat);
//        System.out.println(randomDouble);



//        -----------------------

//        int min = 1;
//        int max = 10;
//        int randomNum = (int)(Math.random() * (max - min + 1) + min); //number [0.0, 1.0]
//        System.out.println(randomNum);

//        -----------------------

//        for (int i = 1; i < 11; i++) {
//            System.out.println(dice());
//        }

        //        -----------------------

//        for (int i = 1; i < 11; i++) {
//            System.out.println(diceMath());
//        }


    }


//    При помощи класса Random сделать метод dice(), возвращающий результат броска кубика -- число от 1 до 6 включительно.
    public static int dice () {
        Random random = new Random();
        return random.nextInt(1,7);

    }


//    Написать метод diceMath, делающий то же самое, что и dice(), но использующий Math.random()

    public static int diceMath () {
        int min = 1;
        int max = 11;
        Random random = new Random();
        return (int)(Math.random()*(max - min + 1)+min);
    }

}
