import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        //не нужно создавать экземляр Рандом для каждого потока
        int randomNum = ThreadLocalRandom.current().nextInt(min, max+1);
        System.out.println(randomNum);
    }
}
