import java.util.ArrayList;

public class TalipHoca16 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(67);
        list.add(23);
        list.add(12);
        list.add(54);
        list.add(35);
        list.add(184);
        list.add(138);
        list.add(1841);
        list.add(141);


        selectionSort(list);

        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }


    public static void selectionSort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            //i ile minIndex yeri değişecek
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
