class Solution {
    public  void reverse(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            int temp  = arr[r];
            arr[r]  = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
    }

    public int[][] flipAndInvertImage(int[][] image)
    {
        for(int i = 0 ; i < image.length ; i++){
            reverse(image[i]);
            for(int j = 0 ; j < image[i].length ; j++){
                if(image[i][j] == 0  ){
                    image[i][j] = 1;
                }else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}