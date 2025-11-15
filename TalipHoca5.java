public class TalipHoca5 {

    public static void main(String[] args) {
        /*

        classlar yaparak, programın anlaşılırlığıın kolaylaştırmak

        public class ALİAKTANCAR

        kapsülleme   getter    setter

        class ın içindeki değişkenler default değere atanır.

        public
        private       erişim seviyesi    zaten hepsi private olacak

        new yeni obje oluşturur
        (init gibi)

        argüman dediğimiz  (greet("talip")
        parameter dediğimiz void(int a)

        parametresiz bi obje varsa, parametreli bir obje de varsa ikisini de ayrı ayrı obje oluştur

        methodlar objenin yapacakları

        void NON-RETURN return etmez

        non-void RETURN return etmek zorundayız

        toString

        230. sayfa falan ödev
        sayfa yap 240
        5. soru

        argümanı bi objeye atarken passed by value oluyor ve asla değişmez
        getter, setter kullanırsam değişir

         */

        Game game = new Game(1000, true);
        System.out.println(game.score);

        System.out.println(game.toString());

    }

}

class Game {
    int score;
    boolean isStarted;

    Game(int score, boolean isStarted) {
        this.score = score;
        this.isStarted = isStarted;
    }

    @Override
    public String toString() {
        return "Score is: " + score;
    }
}


