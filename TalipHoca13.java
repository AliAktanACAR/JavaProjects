public class TalipHoca13 {
    public static void main(String[] args) {
        int number = 10;
        drawParalelkenar(number);

    }
    static void drawParalelkenar(int number){
        for (int satır = 1; satır <= number; satır++){
            for (int space = 1; space <= number - satır; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * satır - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int satır = number-1; satır >= 0; satır--){
            for (int space = 1; space <= number-satır  ; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * satır -1  ; star++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
