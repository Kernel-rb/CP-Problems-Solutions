class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length == 1 || arr.length == 0) return 0;
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            int mid = s + (e - s) /2;
            if(arr[mid] > arr[mid + 1]){
                e = mid;
            }else{
                s = mid + 1;
            }
        }
        return s;
    }
}
