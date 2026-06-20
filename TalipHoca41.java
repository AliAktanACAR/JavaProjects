public class TalipHoca41 {
    public static void main(String[] args) {


    }
}

class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] result = new int[arr2D.length];

        for (int i = 0; i < arr2D.length; i++) {
            result[i] = arr2D[i][c];
        }
        return result;
    }

    public static boolean isLatin(int[][] square) {

        for (int i = 0; i < square.length; i++) {
            for (int j = i + 1; j < square[i].length; j++) {
                if (square[0][i] == square[0][j]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < square.length; i++) {
            int val = square[0][i];

            for (int r = 0; r < square.length; r++) {
                boolean found = false;

                for (int c = 0; c < square.length; c++) {
                    if(square[r][c] == val){
                        found = true;
                    }

                }
                if (found == false){
                    return false;

                }
            }
        }


        for (int i = 0; i < square.length; i++) {
            int val = square[0][i];
            for (int c = 0; c < square.length; c++) {
                boolean found = false;
                for (int r = 0; r < square.length; r++) {
                    if(square[r][c] == val){
                        found = true;
                    }
                }
                if (found == false){
                    return false;
                }
            }
        }
        return true;
    }
}