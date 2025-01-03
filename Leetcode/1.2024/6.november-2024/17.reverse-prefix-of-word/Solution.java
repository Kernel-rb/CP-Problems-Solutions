public class Solution {
    public String reversePrefix(String a, char b) {
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (b == arr[i]) {
                int r = 0;
                int l = i;
                while (r <= l) {
                    char t = arr[r];
                    arr[r] = arr[l];
                    arr[l] = t;
                    r++;
                    l--;
                }
                break;
            }
        }
        return new String(arr);
    }
}

