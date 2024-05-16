package org.example.StringBuilder;

public class RealExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder query = new StringBuilder("SELECT c.brand, c.model, c.color, c.price FROM car c WHERE ");
        String parameter = "model";
        String value = "X6";
        query.append(parameter);
        query.append(" = ");
        query.append("\'" + value + "\'");

        System.out.println(query);
    }
}
