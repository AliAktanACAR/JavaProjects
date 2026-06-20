public class TalipHoca23 {
    public static void main(String[] args) {

        int[] list = {8, 5, 2, 6, 9, 8, 3, 4};

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
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i ++;
            k ++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j ++;
            k ++;
        }

        return result;
    }
}
