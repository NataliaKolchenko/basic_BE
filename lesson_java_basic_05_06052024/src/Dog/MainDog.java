package Dog;

public class MainDog {
    public static void main(String[] args) {

        Dog tom = new Dog(3, "Tom");
        Dog bill = new Dog(7, "Bill");
        Dog tom1 = tom;
        tom1.setName("Carry");
//        System.out.println(tom.getName());
//        System.out.println(tom.getAge());
        System.out.println(tom);
        System.out.println(bill);
        System.out.println( tom.equals(bill));
        System.out.println(tom.equals(tom1));





    }
}