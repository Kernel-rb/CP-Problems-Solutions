class Solution {
    public int findMin(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        
        while(s < e) {
            int mid = s + (e - s) / 2;
            
            if(arr[mid] > arr[e]) {
                s = mid + 1;
            } else if(arr[mid] < arr[e]) {
                e = mid;
            } else {
                // Handle duplicates by reducing the search space by 1
                e--;
            }
        }
        return arr[s];
    }
}
