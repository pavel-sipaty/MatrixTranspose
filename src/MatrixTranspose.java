import java.util.Arrays;
import java.util.Random;

public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] matrix = new int[4][3];

        Random rand = new Random();
        for(int i = 0; i < matrix.length; i++) {
            for(int k = 0; k < matrix[i].length; k++){
                matrix[i][k] = rand.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("/////////");

        int[][] matrixT = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrixT.length; i++){
            for(int k = 0; k < matrixT[i].length; k++){
                matrixT[i][k] = matrix[k][i];
            }
        }
        System.out.println(Arrays.deepToString(matrixT));
    }
}
