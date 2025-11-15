public class TalipHoca10 {
    public static void main(String[] args) {


    }

    public static int[] replaceHighAndLow(int[] arr) {

        int[] tempArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 750) {
                tempArray[i] = 1000;
            } else if (arr[i] < 250) {
                tempArray[i] = 0;
            } else {
                tempArray[i] = arr[i];
            }

            System.out.print(tempArray[i] + " ");
        }

        return tempArray;
    }

}