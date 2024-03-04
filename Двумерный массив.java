import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        int[] minValues = new int[rows];
        for (int i = 0; i < rows; i++) {
            minValues[i] = findMinValue(matrix[i]);
        }

        System.out.println("Минимальные значения в каждой строке:");
        for (int i = 0; i < rows; i++) {
            System.out.print(minValues[i] + "\n");
        }
    }

    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
