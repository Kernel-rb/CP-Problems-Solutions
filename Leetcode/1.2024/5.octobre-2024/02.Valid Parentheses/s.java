import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> parentheses = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                parentheses.push(c);
            } else {
                if (parentheses.empty()) return false;
                char complementaire = parentheses.pop();
                if (complementaire == '(' && c != ')' ||
                    complementaire == '{' && c != '}' ||
                    complementaire == '[' && c != ']') {
                    return false;
                }
            }
        }
        return parentheses.empty();
    }
}
