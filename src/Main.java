import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();


    }

    // Объявить метод «сгенерироватьМассив»
    //generateRandomArray()
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100_000;

        }
        return arr;

    }


    public static void task1() {
        int[] arr = generateRandomArray();

}