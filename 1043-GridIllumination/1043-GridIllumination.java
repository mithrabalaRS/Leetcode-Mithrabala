// Last updated: 8/11/2026, 2:19:52 PM
import java.util.*;

class Solution {

    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {

        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> antiDiag = new HashMap<>();

        Set<Long> active = new HashSet<>();

        // Store active lamps
        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];

            long key = ((long) r << 32) | c;

            if (active.contains(key))
                continue;

            active.add(key);

            row.put(r, row.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            antiDiag.put(r + c, antiDiag.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        int[][] dirs = {
            {0, 0}, {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}
        };

        for (int i = 0; i < queries.length; i++) {

            int r = queries[i][0];
            int c = queries[i][1];

            // Check illumination
            if (row.containsKey(r) ||
                col.containsKey(c) ||
                diag.containsKey(r - c) ||
                antiDiag.containsKey(r + c)) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }

            // Turn off nearby lamps
            for (int[] d : dirs) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n)
                    continue;

                long key = ((long) nr << 32) | nc;

                if (active.remove(key)) {

                    decrease(row, nr);
                    decrease(col, nc);
                    decrease(diag, nr - nc);
                    decrease(antiDiag, nr + nc);
                }
            }
        }

        return ans;
    }

    private void decrease(Map<Integer, Integer> map, int key) {
        map.put(key, map.get(key) - 1);

        if (map.get(key) == 0)
            map.remove(key);
    }
}