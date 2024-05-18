//1 уровень сложности: 1. Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
//Если значение null, то параметр не должен попадать в запрос.
//        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//Результат: SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';


package org.example;

public class StringBuilderCars {
    public static void main(String[] args) {
        String table = "car";
        String model = "V-60";
        String country = "Germany";
        String city = "Berlin";
        String year = "2000";
        String active = "true";

        StringBuilder queryCar = new StringBuilder();
        queryCar.append("SELECT");
        queryCar.append(" * ");
        queryCar.append("FROM ");
        queryCar.append(table);
        queryCar.append(" WHERE ");
        queryCar.append(model != null ? "model = '" + model + "' AND " : "");
        queryCar.append(country != null ? "country = '" + country + "' AND " : "");
        queryCar.append(city != null ? "city = '" + city + "' AND " : "");
        queryCar.append(year != null ? "year = '" + year + "' AND " : "");
        queryCar.append(active != null ? "active = '" + active + "'" : "");



        System.out.println(queryCar);




//        queryCar.append(paramCountry + " = \'" + country + "\' AND " + paramCity + " = \'" + city + "\' AND "  + paramModel + " = \'" + model + "\' AND "
//                + paramYear + " = \'" + year + "\' AND "  + paramActive + " = \'" + active + "\'");
//
//        System.out.println(queryCar);





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



