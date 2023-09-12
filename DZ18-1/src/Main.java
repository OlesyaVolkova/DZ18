import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        //cумма элементов
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма элементов: " + sum);

        //среднее-арифметическое элементов
        int count = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                sum += arr[x][y];
                count++;
            }
        }
        System.out.println("Среднее-арифметическое элементов: " + (double) sum / count);

        //минимальное значение и максимальное значение
        int min, max;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if (arr[a][b] < min) min = arr[a][b];
                if (arr[a][b] > max) max = arr[a][b];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сортировку двумерного массива не решила.");
      /* отсортировать двумерные массивы через алгоритм.
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                if (arr[k].length < arr.length) {
                  }
            }
        }*/
    }
}