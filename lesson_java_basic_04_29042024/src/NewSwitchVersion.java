////java 13+
//public class NewSwitchVersion {
//
//    public static void main(String[] args) {
//
//        int day = 7;
//        String value  = switch (day) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> {
//                System.out.println("It's Wednesday");
//                yield "Wednesday";
//            }
//            case 4 -> "Thuesday";
//            case 5 -> "Friday";
//            case 6 -> {
//                System.out.println("It's Saturdayyyy");
//                yield "Saturday";
//            }
//            case 7 -> {
//                System.out.println("Sunday! Party time");
//                yield "Sunday";
//            }
//
//            default -> {
//                throw new RuntimeException("Wrong day");
//            }
//
//        };
//        System.out.println(value);
//
//    }
//}
