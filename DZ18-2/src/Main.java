import java.util.Random;

class Main {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;
        int[][] arr= new int[rows][cols];

        Random rand = new Random(0);
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
    }
}