public class BoxingUnboxing {

    public static void main (String [] args) {

//        неявное преобразование
        int i1 = 127; //127 - byte
        int i2 = 32000; //32000 - short
        double d1 = i1; //127 - int

//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(d1);

//        явное преобразование

//        byte b = 127; //-128...127
        int i3 = 128;
        byte b = (byte) i3;
        System.out.println(b);

    }
}
