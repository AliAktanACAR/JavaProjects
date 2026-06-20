public class TalipHoca17 {
    public static void main(String[] args) {
        int[][] list =  {
                {1, 5, 4, 8, 7, 3},
                {2, 4 ,3, 5, 7, 6},
                {2, 4, 3, 3, 6, 0},
                {9, 8, 9, 9, 4, 1}
        };

        changeOddRows(list);

        // print
        for (int[] row : list) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void changeOddRows(int [][] list) {
        for (int row = 0; row < list.length - 1; row++) {

            if ((row % 2) == 0) {
                for (int column = 0; column < list[0].length; column ++) {
                    list[row + 1][column] = list[row][column];
                }
            }
        }
    }
}

