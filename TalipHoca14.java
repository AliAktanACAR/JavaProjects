import java.util.ArrayList;


public class TalipHoca14 {
    public static void main(String[] args) {


        /*
        Array method fazla yok köşeli parantez koyup onunla söylüyoruz, işlemler yapıyoruz.
        Arraylist methodlar var add, set, remove, size, get.


        347 ödev
        355 ödev

        5 3 8 1 6 4 2 7

        1 3 8 5 6 4 2 7
        1 2 8 5 6 4 3 7
        1 2 3 5 6 4 8 7
        1 2 3 4 6 5 8 7


        10, 11, 12, 13




         */

        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Hoca");
        liste.add("Ali");
        liste.add("Hoca");

        liste.add(1, "Muhammed");


        System.out.println(liste);

        for  (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        for (String s : liste) {
            System.out.println(s);
        }

    }
}
