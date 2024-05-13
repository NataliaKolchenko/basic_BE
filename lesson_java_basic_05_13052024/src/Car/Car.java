package Car;//Создайте 5 объектов типа Car.Car
//        Объект Car.Car должен содержать поля
//private double price;
//private String model;
//        и конструктор с этими полями



public class Car {
    private double price;
    private String model;

    public Car (double price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString () {
        return this.model + " " + this.price;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
