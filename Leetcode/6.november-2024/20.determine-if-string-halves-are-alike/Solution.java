class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        return countV(s.substring(0, mid)) == countV(s.substring(mid));
    }
    
    private int countV(String s) {
        int counter = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                counter++;
            }
        }
        return counter;
    }
}