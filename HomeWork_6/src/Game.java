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

        int locX = 0;
        int locY = 0;

//        String userAction = scanner.nextLine();

        while (true) {
            String userAction = scanner.nextLine();

            if (userAction.equals("stop")) {
                break;
            } else {
                switch (userAction) {
                    case "up": locY = locY + 1; break;
                    case "down": locY = locY - 1; break;
                    case "right": locX = locX + 1; break;
                    case "left": locX = locX - 1; break;
                }
                System.out.println("Location is " + locX + "." + locY);
            }


        }



    }
}