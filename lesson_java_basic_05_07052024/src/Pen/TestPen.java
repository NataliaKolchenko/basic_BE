package Pen;//        Создайте класс Test
//        Создайте три объекта типа Pen.Pen
//        Создайте массив L = 3
//        Сохраните все объекты в массив
//        Достаньте поочередно из массива ручки и измените цвет каждой на 
//        “Green”
//        “Red” 
//        “Black”


import Pen.Pen;

public class TestPen {

    public static void main(String[] args) {

        Pen[] pens = new Pen[] {
                new Pen("pink"),
                new Pen ("orange"),
                new Pen ("blue")
        };

        System.out.println("Pens:");
        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].getColor());
        }

//        Достаньте поочередно из массива ручки и измените цвет каждой
        System.out.println();

        pens[0].setColor("Green");
        pens[1].setColor("Red");
        pens[2].setColor("Black");

        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].getColor());
        }


    }
}


