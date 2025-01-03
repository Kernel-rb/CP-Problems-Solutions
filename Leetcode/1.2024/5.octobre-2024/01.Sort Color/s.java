class Solution {
    public void sortColors(int[] n) {
        boolean  swapped;
        for(int i = 0 ; i < n.length ;i++){
            swapped = false;   
            for(int j = 1 ; j < n.length - i ; j++){
                if(n[j] < n[j-1]){
                    int temp = n[j - 1];
                    n[j-1] = n[j]; 
                    n[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}