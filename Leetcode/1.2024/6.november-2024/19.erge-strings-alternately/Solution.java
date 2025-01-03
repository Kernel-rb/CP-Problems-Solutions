class Solution {
    public String mergeAlternately(String a1, String a2) {
        int a1_L = a1.length();
        int a2_L = a2.length();
        StringBuilder r = new StringBuilder(a1_L + a2_L);
        int l_a1 = 0;
        int l_a2 = 0;
        while (l_a1 < a1_L && l_a2 < a2_L) {
            r.append(a1.charAt(l_a1));
            r.append(a2.charAt(l_a2));
            l_a1++;
            l_a2++;
        }
        while (l_a1 < a1_L) {
            r.append(a1.charAt(l_a1));
            l_a1++;
        }

        while (l_a2 < a2_L) {
            r.append(a2.charAt(l_a2));
            l_a2++;
        }

        return r.toString();
    }
}