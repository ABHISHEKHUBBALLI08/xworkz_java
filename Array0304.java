public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 10, 8, 2, 1};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }
        arr = new int[j];
        System.arraycopy(temp, 0, arr, 0, j);

        System.out.println("Array after removing duplicates:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
