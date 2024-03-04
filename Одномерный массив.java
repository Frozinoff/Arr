import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int size = 10;
        final int maxNumber = 50;

        int[] originalArray = new int[size];
        int[] smallerValues = new int[size];
        int[] smallerValuesIndices = new int[size];
        int smallerValuesCount = 0;

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            originalArray[i] = random.nextInt(100);
        }

        for (int i = 0; i < size; i++) {
            if (originalArray[i] < maxNumber) {
                smallerValues[smallerValuesCount] = originalArray[i];
                smallerValuesCount++;
            }
        }

        System.out.println("Массив:");
        printArray(originalArray);

        System.out.println("\nМассив меньших значений:");
        printArray(smallerValues, smallerValuesCount);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArray(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
