public class TalipHoca12 {
    public static void main(String[] args) {

        int number = 5;
        drawTriangle(number);

    }
    static void drawTriangle(int number) {
        for (int satır = 1; satır <= number; satır++) {
            for (int space = 1; space <= number - satır; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * satır - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
