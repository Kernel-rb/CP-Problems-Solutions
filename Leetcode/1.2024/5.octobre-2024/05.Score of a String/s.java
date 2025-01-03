class Solution {
    public int scoreOfString(String s) {
        int counter = 0 ;
        ArrayList<Integer> ascii = new ArrayList<Integer>();
        for (char c : s.toCharArray()) { 
            ascii.add((int)c);
        }
        for(int i = 1 ; i < ascii.size() ; i++){
            counter +=  Math.abs(ascii.get(i - 1)  - ascii.get(i));
        }
        return counter;
    }
}