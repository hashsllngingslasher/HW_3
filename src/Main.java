import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {12.3, -45.7, -56.8, -90.1, -34.6, 23.5, -87.7, 12.3, -67.9, 45.7, -98.8, -56.8, -10.1, 10.0, -1.2};

        boolean exception = true;
        double result = 0;
        int quantity = 0;

        for (double timeVariable : array) {
            if (exception) {
                if (timeVariable < 0) {
                    exception = false;
                }
            } else if (timeVariable > 0) {
                result += timeVariable;
                quantity++;
            }
        }
        System.out.println("Среднее арифметическое: " + result / quantity);
        System.out.println("-------------------------------------------");


        int[] newArray = {2, 0, -5, -10, 5, 10, -2};
        System.out.println("Исходный массив: " + Arrays.toString(newArray) + "\n" + " ");
        sortArray(newArray);
    }


    public static void sortArray(int[] newArray) {
        int n = newArray.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (newArray[j] < newArray[minIndex]) {
                    minIndex = j;
                }
            }

            int a = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = a;

            System.out.println("   Итерация " + (i + 1) + ":   " + Arrays.toString(newArray));
        }
    }
}


