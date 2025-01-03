class s {
    public int findDuplicate(int[] arr) {
        cyclicSort(arr);
        return arr[arr.length -1];
    }

    public void cyclicSort(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                    swap(arr , i , correctIdx);
            }else{
                i++;
            }
        }
    }

    public void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
