//1 уровень сложности: 1. Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
//Если значение null, то параметр не должен попадать в запрос.
//        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//Результат: SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';


package org.example;

public class StringBuilderCars {
    public static void main(String[] args) {
        StringBuilder queryCar = new StringBuilder("SELECT * FROM cars WHERE ");

        String paramModel = "model";
        String model = "V-60";
        String paramCountry = "Country";
        String country = "Germany";
        String paramCity = "City";
        String city = "Berlin";
        String paramYear = "Year";
        int year = 2000;
        String paramActive = "Active";
        boolean active = true;



        queryCar.append(paramCountry + " = \'" + country + "\' AND " + paramCity + " = \'" + city + "\' AND "  + paramModel + " = \'" + model + "\' AND "
                + paramYear + " = \'" + year + "\' AND "  + paramActive + " = \'" + active + "\'");

        System.out.println(queryCar);





    }

//    public static void main(String[] args) {
//    StringBuilder query = new StringBuilder("SELECT c.brand, c.model, c.color, c.price FROM car c WHERE ");
//    String parameter = "model";
//    String value = "X6";
//    query.append(parameter);
//    query.append(" = ");
//    query.append("\'" + value + "\'");
//
//    System.out.println(query);
//}
}


