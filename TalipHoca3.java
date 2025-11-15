public class TalipHoca3 {
    public static void main(String[] args) {


    String input = "may be force be with you a b ";
    System.out.println(getCountOfSpace(input));


    }
    static int getCountOfSpace(String input) {
        int spaceCount = 0;

        int lastPosition = 0;

        while (lastPosition != -1) {

            int foundPosition = input.indexOf(" ", lastPosition);

            if (foundPosition != -1) {
                spaceCount += 1;
                lastPosition = foundPosition + 1;
            } else {
                lastPosition = -1;
            }
        }

        return spaceCount;
    }
}
