public class TalipHoca2 {
    public static void main(String[] args) {

        int number = 131841;
        System.out.println(sumAllDigit(number));

    }

    public static int sumAllDigit(int number) {
        int result = 0;

        while (number > 0) {
            int digit = number % 10;
            result += digit;
            number /= 10;
        }

        return result;
    }
}
