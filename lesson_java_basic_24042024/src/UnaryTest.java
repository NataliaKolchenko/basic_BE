//        1. Создайте класс UnaryTest
//        2. Создайте переменную с положительным знаком
//        3. Примените к переменной пост-инкремент и пост-декремент
//        4. Примените к переменной пре-инкремент и пре-декремент
//        5. Используя режим дебаггера проследите изменения

public class UnaryTest {
    public static void main(String[] args) {
        int number = 3;
        number++; // постфиксный инкремент сначала берет значение, потом увеличивает (берете НЕ увеличенное значение)
        number--; // постфиксный декремент сначала берет значение, потом уменьшает его (берете НЕ уменьшенное значение)
        ++number; // префиксный  инкремент сначала увеличивает значение, потом берет (берете УВЕЛИЧЕННОЕ значение)
        --number; // префиксный  декремент сначала уменьшает значение,   потом берет (берете УМЕНЬШЕННОЕ значение)
    }
}
