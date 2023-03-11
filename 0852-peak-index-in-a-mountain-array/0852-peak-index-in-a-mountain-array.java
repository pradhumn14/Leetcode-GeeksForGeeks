class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of the array
                // this may be the answer, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in the asc part of the array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the above 2 checks
        // start & end are always trying to find the max element in the above two checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        return start;

    }
}