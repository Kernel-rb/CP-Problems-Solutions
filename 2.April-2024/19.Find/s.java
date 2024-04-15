import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Integer> findPeaks(int[] m) {
        List<Integer> peak = new ArrayList<>();
        for (int i = 1; i < m.length - 1; i++) {
            if (m[i] > m[i + 1] && m[i] > m[i - 1]) {
                peak.add(i);
            }
        }
        return peak;
    }
}

