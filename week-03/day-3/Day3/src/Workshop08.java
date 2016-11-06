import java.util.Arrays;

/**
 * Created by regnisalram on 11/4/16.
 */
public class Workshop08{
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output
        int[][] diagonalOnes = new int[4][4];
        /*
        int[][] diagonalOnes = new int[][] = {{1 0 0 0}, {0 1 0 0}, {0 0 1 0}, {0 0 0 1}};
         */


        for (int row = 0; row < diagonalOnes.length; row++) {
            for (int column = 0; column < diagonalOnes[row].length; column++){
                if (diagonalOnes[row] == diagonalOnes[column]) {
                    diagonalOnes [row][column] = 1;
                }
                System.out.print(diagonalOnes[row][column] + " ");
            }
            System.out.println();
        }
    }
}
