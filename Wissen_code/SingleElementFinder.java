package Wissen_code;

public class SingleElementFinder {

    public static int findSingleElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Edge case: only one element
        if (arr.length == 1) return arr[0];

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) mid--;

            if (arr[mid] == arr[mid + 1]) {
                // The unique element is in the right half
                low = mid + 2;
            } else {
                // The unique element is in the left half (or is at mid)
                high = mid;
            }
        }

        // low == high is the index of the single element
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 4, 5, 6, 6, 7, 7};
        int result = findSingleElement(arr);
        System.out.println("Single non-duplicate element: " + result);
    }
}

