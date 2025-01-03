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
        if (mountainArr.length() == 0) return -1;
        int peakIdx = findPeak(mountainArr);
        int result = binarySearch(mountainArr, target, 0, peakIdx, true);
        if (result != -1) return result;
        return binarySearch(mountainArr, target, peakIdx + 1, mountainArr.length() - 1, false);
    }
    
    public int findPeak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean Asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;  
            int laValeurDyalmid =  mountainArr.get(mid);          
            if ( laValeurDyalmid == target) {
                return mid;
            }
            if (Asc) {
                if (laValeurDyalmid < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if ( laValeurDyalmid > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}






























