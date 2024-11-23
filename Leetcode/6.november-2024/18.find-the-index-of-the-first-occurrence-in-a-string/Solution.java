class Solution {
    public int strStr(String a, String b) {
        if(a.length() < b.length()) return -1;
        if(a.equals(b)) return 0;
        int l = 0; 
        int r = l + b.length() - 1;
        while(r < a.length()){
            if(a.substring(l, r + 1).equals(b)) {
                return l;
            }
            l++;
            r = l + b.length() - 1;
        }
        return -1;
    }
}