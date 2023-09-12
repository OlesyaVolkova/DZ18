import java.util.Random;

class Main {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;
        int[][] arr= new int[rows][cols];

        Random rand = new Random();
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                int newRand;
                newRand = rand.nextInt(100);
                arr[i][j] = newRand;
            }
        }
        for(int i=0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int count = 0;
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < cols; l++) {
                        if (arr[i][j] == arr[k][l]) {
                            count++;
                        }
                    }
                }
                System.out.println("Число %d встречается %d раз".formatted(arr[i][j], count));
            }
        }
    }
}
