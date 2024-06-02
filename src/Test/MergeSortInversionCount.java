package Test;
public class MergeSortInversionCount {

    // Method to conquer and merge subarrays while counting inversions
    public static int mergeAndCount(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store merged subarray
        int merge[] = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;
        int swaps = 0;

        // Merge the subarrays into the temporary array
        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merge[x] = arr[indx1++];
            } else {
                merge[x] = arr[indx2++];
                swaps += (mid + 1 - indx1);  // Count inversions
            }
            x++;
        }

        // Copy remaining elements from first subarray, if any
        while (indx1 <= mid) {
            merge[x++] = arr[indx1++];
        }

        // Copy remaining elements from second subarray, if any
        while (indx2 <= ei) {
            merge[x++] = arr[indx2++];
        }

        // Copy the merged array back to the original array
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }

        return swaps;
    }

    // Method to divide array into subarrays and count inversions
    public static int divideAndCount(int arr[], int si, int ei) {
        // Base case: if array has only one element, return
        if (si >= ei) {
            return 0;
        }
        int mid = si + (ei - si) / 2;
        int leftCount = divideAndCount(arr, si, mid);
        int rightCount = divideAndCount(arr, mid + 1, ei);
        int mergeCount = mergeAndCount(arr, si, mid, ei);
        return leftCount + rightCount + mergeCount;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5 };
        int n = arr.length;
        int inversionCount = divideAndCount(arr, 0, n - 1);
        System.out.println("Number of inversions: " + inversionCount);
    }
}

