import java.util.Scanner;

public class MaytrixTranspose {
    static void transposeMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        transposeMatrix(matrix);
        for(int[] row: matrix){
            for(int elem: row){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}
