package Pen;//Создайте класс ручка (Pen.Pen)
//        Определите свойство color типа String с доступом private
//Создайте методы getColor(); setColor(String newColor);


public class Pen {



    private String color;

    public Pen (String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
