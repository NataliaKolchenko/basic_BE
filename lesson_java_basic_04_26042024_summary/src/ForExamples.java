import java.util.LinkedList;
import java.util.List;

public class ForExamples {

    public static void main(String[] args) {

        int x = 0;
        boolean isOn = true;
        while (isOn) {
            System.out.println("sdfsf");
            if (x== 10) {
                isOn = false;
            }
            x++;
        }
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("A");
        stringLinkedList.add("B");

        for (String str : stringLinkedList) {
            System.out.println(str);
        }
        stringLinkedList.forEach(str -> System.out.println(str));
        stringLinkedList.forEach(System.out::println);
        // лист констант
        List<Integer> integers = List.of(1, 2, 4, 5);

    }
}
