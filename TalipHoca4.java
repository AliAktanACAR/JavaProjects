public class TalipHoca4 {
    public static void main(String[] args) {

        System.out.println(reversed("TalipHoca4"));
    }

    public static String reversed(String input) {

        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.substring(i, i + 1);
        }

        return result;
    }
}

/*

sorular var onları yap.

 */


