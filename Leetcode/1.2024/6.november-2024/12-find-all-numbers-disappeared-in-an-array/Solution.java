class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> r = new ArrayList<Integer>();
        cyclicSort(arr);
        for(int i  = 0 ;  i<  arr.length ; i++){
            if( i !=  arr[i] - 1  ){
                r.add(i + 1);
            }
        }
        return r;
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
