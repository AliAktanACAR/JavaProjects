public class TalipHoca24 {
    public static void main(String[] args) {
        boolean a = true;
        int[] list = {1,2,3,4,8,12,17,19,23,24,28,75,99,101};
        int result=binarySearch(list, 0, list.length - 1, 19 );

        System.out.println(result);

    }

    public static int binarySearch(int[] list, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        }

        int middle = begin + (end - begin) / 2;

        if (list[middle] == target) {
            return middle;
        } else if (list[middle] < target) {
            return binarySearch(list, middle + 1, end, target);
        } else {
            return binarySearch(list, begin, middle - 1, target);

        }
    }


    /*
    vede hepsi
    yadada biri


    2.ÜNİTE Tekrar

    eicraz    nieicr


    0 1
    1 3
    2 5


    0 1
    1 3
    2 5


index = 3
k = 4
maxcounter = 1
counter = 1
     */
}
