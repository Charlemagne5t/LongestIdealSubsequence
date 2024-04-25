import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();

        Map<Integer, Integer> dp = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            dp.put(i, 0);
        }

        int max = 1;

        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            int maxSeq = 0;
            for (int j = Math.max(0, (ch - k)); j < Math.min(26, ch + k + 1) ; j++) {
                maxSeq = Math.max(dp.get(j), maxSeq);
            }
            dp.put(ch, maxSeq + 1);
        }


        return dp.values().stream().reduce(Integer::max).get();
    }
}