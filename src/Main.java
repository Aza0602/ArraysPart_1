import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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

    private static void task2() {
        System.out.println("Задача 2");

        System.out.println("Вариант 1");
        int[] digits = new int[3];
        digits[0] = 1;
        digits[1] = 2;
        digits[2] = 3;

        System.out.print(digits[0] + ", ");
        System.out.print(digits[1] + ", ");
        System.out.println(digits[2]);

        System.out.println("Вариант 2");
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};

        System.out.print(fractionalNumbers[0] + ", ");
        System.out.print(fractionalNumbers[1] + ", ");
        System.out.println(fractionalNumbers[2]);

        System.out.println("Вариант 3");
        int[] numbers = {5, 2, 12, 52, 63, 54, 85};

        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[3] + ", ");
        System.out.print(numbers[4] + ", ");
        System.out.print(numbers[5] + ", ");
        System.out.println(numbers[6]);
    }

    private static void task3() {
        System.out.println("Задача 3");

        System.out.println("Вариант 1");
        int[] digits = {1, 2, 3};

        for (int i = 0; i < digits.length / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[digits.length -1 - i];
            digits[digits.length -1 - i] = temp;
        }
        System.out.println(Arrays.toString(digits));

        System.out.println("Вариант 2");
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};

        for (float j = 0; j < fractionalNumbers.length / 2f; j++) {
            float temp = fractionalNumbers[(int) j];
            fractionalNumbers[(int) j] = fractionalNumbers[(int) (fractionalNumbers.length -1 - j)];
            fractionalNumbers[(int) (fractionalNumbers.length - 1 - j)] = temp;
        }
        System.out.println(Arrays.toString(fractionalNumbers));

        System.out.println("Вариант 3");
        int[] numbers = {5, 2, 12, 52, 63, 54, 85};

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -1 - i];
            numbers[numbers.length -1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void task4() {
        System.out.println("Задача 4");

        System.out.println("Вариант 1");
        int[] digits = {1, 2, 3};

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 != 0) {
                digits[i]++;
            }
        }
        System.out.println(Arrays.toString(digits));

        System.out.println("Вариант 2");
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};

        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (fractionalNumbers[i] % 2 != 0) {
                fractionalNumbers[i]++;
            }
        }
        System.out.println(Arrays.toString(fractionalNumbers));

        System.out.println("Вариант 3");
        int[] numbers = {5, 2, 12, 52, 63, 54, 85};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}

