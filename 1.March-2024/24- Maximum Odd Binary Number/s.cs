public class Solution {
    public int CountOperations(int n1, int n2) {
        int ops = 0 ;
        while( n1>0  && n2> 0 ){
            if(n1 > n2){
                n1 -= n2;
                ops += 1;
            }else{
                n2 -= n1;
                ops += 1;
            }
        }
        return ops;
    }
}