public class TalipHoca22 {
    public static void main(String[] args) {

        int[] list = {8, 5, 2, 6, 9, 1, 3, 4};

        int[] result = mergeSort(list, 0, list.length - 1);

        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static int[] mergeSort(int[] list, int begin, int end) {
        if (begin == end) {
            int[] result = new int[1];
            result[0] = list[begin];
            return result;
        }

        int middle = (begin + end) / 2;

        int[] left = mergeSort(list, begin, middle);
        int[] right = mergeSort(list, middle + 1, end);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] newLeft = new int[left.length + 1];
        int [] newRight = new int[right.length + 1];

        int leftCounter = 0;

        for (leftCounter = 0; leftCounter < left.length; leftCounter++) {
            newLeft[leftCounter] = left[leftCounter];
        }

        newLeft[leftCounter] = Integer.MAX_VALUE;

        int rightCounter = 0;

        for (rightCounter = 0; rightCounter < right.length; rightCounter++) {
            newRight[rightCounter] = right[rightCounter];
        }

        newRight[rightCounter] = Integer.MAX_VALUE;


        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < newLeft.length && j < newRight.length && k < result.length) {
            if (newLeft[i] < newRight[j]) {
                result[k] = newLeft[i];
                i++;
            } else {
                result[k] = newRight[j];
                j++;
            }
            k++;
        }

        return result;
    }
}
