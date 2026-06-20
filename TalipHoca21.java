import java.util.Arrays;

public class TalipHoca21 {

    public static void main(String[] args) {
        int[] dizi = {8, 3, 5, 2, 7, 4,10,43,5,6,7,89};

        mergeSort(dizi);

        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
    }


    public static void mergeSort(int[] dizi) {
        if (dizi.length <= 1) {
            return;
        }

        int orta = dizi.length / 2;

        int[] sol = new int[orta];
        int[] sag = new int[dizi.length - orta];

        for (int i = 0; i < orta; i++) {
            sol[i] = dizi[i];
        }

        for (int i = orta; i < dizi.length; i++) {
            sag[i - orta] = dizi[i];
        }

        mergeSort(sol);
        mergeSort(sag);

        merge(dizi, sol, sag);
    }

    static void merge(int[] dizi, int[] sol, int[] sag) {
        int i = 0, j = 0, k = 0;

        while (i < sol.length && j < sag.length) {
            if (sol[i] <= sag[j]) {
                dizi[k] = sol[i];
                i++;
            } else {
                dizi[k] = sag[j];
                j++;
            }
            k++;
        }

        while (i < sol.length) {
            dizi[k] = sol[i];
            i++;
            k++;
        }

        while (j < sag.length) {
            dizi[k] = sag[j];
            j++;
            k++;
        }
    }
}
