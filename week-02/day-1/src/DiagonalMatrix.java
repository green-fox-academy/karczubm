// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class DiagonalMatrix {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j){
                    matrix[i][j]=1;
            }
                System.out.print(matrix[i][j]+" ");
        }
            System.out.println("");
        }

    }
}
