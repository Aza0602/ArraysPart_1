public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        System.out.println("Задача 1");

        System.out.println("Вариант 1");
        int[] digits = new int[3];
        digits[0] = 1;
        digits[1] = 2;
        digits[2] = 3;

        System.out.println(digits[0]);
        System.out.println(digits[1]);
        System.out.println(digits[2]);

        System.out.println("Вариант 2");
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};

        System.out.println(fractionalNumbers[0]);
        System.out.println(fractionalNumbers[1]);
        System.out.println(fractionalNumbers[2]);

        System.out.println("Вариант 3");
        int[] numbers = {5, 2, 12, 52, 63, 54, 85};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
    }
}