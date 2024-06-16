class Solution {
    public int countSegments(String s) {
        int counter = 0 ;
        String[] s_arr = s.split(" ");
        for(int i = 0 ; i < s_arr.length ; i++){
            if(!(s_arr[i].equals(""))){
                counter++;
            }
        }
        return counter;
    }
}