public class TalipHoca11 {
    public static void main(String[] args) {


/*
325
 */

    }
    public static int[] generateOnlyEvens(int length, int upperInterval) {

        int[] result = new int[length];

        int count = 0;

        while ( count < length ) {
            int random = (int)(Math.random() * 101);

            if (random % 2 == 0) {
                result[count] = random;
                count ++;
            }
        }

        return result;
    }
}
