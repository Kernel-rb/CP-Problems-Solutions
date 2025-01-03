class Solution {
    public int findNumbers(int[] n) {
        int c = 0; 
        for(int i = 0 ; i < n.length ; i++)
        {
            if(even(n[i])) c++;
        } 
        return c;
    }

    public boolean even(int n){
        return len(n) % 2 == 0;
    }
    public int  len(int n){
        // 10**x = n <=> x = log10(n) 
        return (int)(Math.log10(n)) + 1;
    }
}