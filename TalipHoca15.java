import java.util.ArrayList;


public class TalipHoca15 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(67);
        list.add(23);
        list.add(12);
        list.add(54);
        list.add(35);
        list.add(184);
        list.add(138);
        list.add(1841);
        list.add(141);


        insertionSort(list);

        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

    public static void insertionSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size() ; i++) {

            int temp = list.get(i);
            int j = i-1;

            while (j>= 0 && temp < list.get(j)) {
                list.set(j+1, list.get(j));
                j--;

            }
            list.set(j+1, temp);
        }
    }
}
