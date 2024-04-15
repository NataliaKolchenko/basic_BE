public class PizzaSize {

    public static void main(String[] args) {

        int pizzaDiameterOld = 24; //sm

        double squarePizzaOld = pizzaDiameterOld * pizzaDiameterOld / 4 * Math.PI;



        //1 квадратный см = 40 ккал
        int oneQuadroSm = 40;

        double totalKkalOldPizza = oneQuadroSm * squarePizzaOld;
        //System.out.println("Пицца диаметром " + pizzaDiameterOld + " см имеет площадь " + squarePizzaOld + " см в квадрате " + "и калорийность " + totalKkalOldPizza + "ккал");

        int pizzaDiameterNew = 28; //sm
        double squarePizzaNew = pizzaDiameterNew * pizzaDiameterNew / 4 * Math.PI;

        double totalKkalNewPizza = oneQuadroSm * squarePizzaNew;


        //System.out.println("Пицца диаметром " + pizzaDiameterNew + " см имеет площадь " + squarePizzaNew + " см в квадрате" + "и калорийность " + totalKkalNewPizza + "ккал");

        double extraKkal = Math.round(totalKkalNewPizza - totalKkalOldPizza);

        System.out.println(extraKkal + " лишних ккал в пицце с диаметром " + pizzaDiameterNew + " см");





    }
}
