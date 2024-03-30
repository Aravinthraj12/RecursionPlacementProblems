import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,4,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        int n = arr.length;
        boolean swap = false;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap=true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swap) {
                break;//for best case
            }
        }
    }
}
