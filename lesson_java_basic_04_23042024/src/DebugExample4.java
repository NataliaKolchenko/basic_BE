public class DebugExample4 {

    public static void main(String[] args) {
        String str = "Hello";
        while (str == "Hello") {
            //System.out.println(str);
            str += " World";
            System.out.println(str);
        }
    }
}
