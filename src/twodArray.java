public class twodArray {
    public static void main(String[] args) {
         twodArray matrix =new twodArray();
         matrix.twodarray();

    }
    public void twodarray() {
        int[][] matrix =
                {{7, 2, 3},
                        {4, 0, 2}};
        for (int[] row : matrix) {
            for (int j : row) {
                System.out.print(j + " \t");
            }
            System.out.println(" ");
        }
    }

}

