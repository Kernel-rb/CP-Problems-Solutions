class Solution {
    public int search(int[] n, int target) {
        int p = pivot(n);
        if (p == -1) return binarySearch(n, 0, n.length - 1, target);
        if (n[p] == target) return p;
        if (target >= n[0]) {
            return binarySearch(n, 0, p - 1, target);
        } else {
            return binarySearch(n, p + 1, n.length - 1, target);
        }
    }

    private int pivot(int[] n) {
        int l = 0;
        int r = n.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid > l && n[mid] < n[mid - 1]) return mid - 1;
            if (mid < r && n[mid] > n[mid + 1]) return mid;
            if (n[l] >= n[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    private int binarySearch(int[] n, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (n[mid] == target) return mid;
            if (target < n[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}

