public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 8, 10, 40, 50 };
        int target = 2;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is found at index " + result);
        }
    }
}
