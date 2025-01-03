class Solution {
    public int[] findErrorNums(int[] arr) {
        cycleSort(arr);
        for(int  i =  0 ; i < arr.length ; i++){
            if(arr[i] != i + 1 ){
                return new int[]{arr[i] , i+1};  
            }
        }
        return new int[]{-1 , -1};

    }
        
    public  void cycleSort(int[] arr){
        int i = 0; 
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
    }

    
    public  void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}