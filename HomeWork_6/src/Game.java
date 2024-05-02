//        1 уровень сложности: Напишите программу, которая принимает команды управления
//        персонажем в текстовой игре (up, down, right, left).
//        Используйте switch-case для обработки команд и
//        изменения положения персонажа на карте или вывода сообщений о локации персонажа.
//        На команду loc должны выводиться текущие координаты.
//        Изначально начинаем в точке с координатами 0,0

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int startX = 0;
       // int startY = 0;

        int x = 0;
        int y = 0;


//        String userAction = scanner.nextLine();

        while (true) {
            String userAction = scanner.nextLine();

            if (userAction.equals("stop")) {
                break;
            } else {
                switch (userAction) {
                    case "up": y = y + 1; break;
                    case "down": y = y - 1; break;
                    case "right": x = x + 1; break;
                    case "left": x = x - 1; break;
                    case "loc":
                        System.out.println("Location is " + x + "." + y); break;
                }

            }


        }



    }
}