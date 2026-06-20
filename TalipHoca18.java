public class TalipHoca18 {
    public static void main(String[] args) {

        boolean [][] result = makeGrid(3, 4);

        for (boolean[] row : result) {
            for (boolean element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static boolean[][] makeGrid(int rows, int cols) {
        boolean[][] grid = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid[row][col] = ((col + row) % 2 == 0);
            }
        }

        return grid;
    }
}

