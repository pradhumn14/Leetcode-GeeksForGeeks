/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
        }
        
    }

    public int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
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

    public int orderAgnosticBS(MountainArray arr, int target, int start, int end) {


        // find whether the array is ascending or descending
//        boolean isAsc;
//
//        if (arr[start] > arr[end]) {
//            isAsc = false;
//        } else {
//            isAsc = true;
//        }

//        in short


        boolean isAsc = arr.get(start) < arr.get(end);


        while (start <= end) {

            // find the middle element
//            int mid = (start + end ) / 2; // might be possible that (start + end) exceeds the range of int in java

            // better way
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }

        return -1;

    }
    
}