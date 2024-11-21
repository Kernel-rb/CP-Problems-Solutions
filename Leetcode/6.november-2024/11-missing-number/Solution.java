class Solution {
    public int missingNumber(int[] arr) {
        cyclicSort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
    
    public void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
