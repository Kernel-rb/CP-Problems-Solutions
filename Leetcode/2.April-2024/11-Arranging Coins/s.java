class Solution {
    public int arrangeCoins(int n) {
        int counter = 0;
        int start =1 ;
        while(n > 0 ){
            n -= start ;
            start += 1;
            if(n >= 0 ){
                counter++;
            }
        }
        return counter;
    }
}