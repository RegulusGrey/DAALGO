import java.util.Arrays;
import java.util.Scanner;

class MergeSort implements Sorter {
    public void sort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] leftArr = new int[mid];
            int[] rightArr = new int[arr.length - mid];

            //copy elements to left and right arrays
            System.arraycopy(arr, 0, leftArr, 0, mid);
            System.arraycopy(arr, mid, rightArr, 0, arr.length - mid);

            //recursively sort left and right arrays
            sort(leftArr);
            sort(rightArr);

            //merge sorted left and right arrays
            merge(leftArr, rightArr, arr);
        }
    }

    private void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        //copy remaining elements from left array, if any
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        //copy remaining elements from right array, if any
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }
}