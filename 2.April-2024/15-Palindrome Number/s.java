class Solution {
    public boolean isPalindrome(int x) {
        String str_x = String.valueOf(x);
        String z = new StringBuilder(str_x).reverse().toString();
        String revresed_z = new StringBuilder(z).reverse().toString();
        if(str_x.equals(revresed_z) && str_x.equals(z)){
            return true;
        }
        return false;
    }
}