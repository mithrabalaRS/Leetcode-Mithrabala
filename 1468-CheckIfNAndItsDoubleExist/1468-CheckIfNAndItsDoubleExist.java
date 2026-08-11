// Last updated: 8/11/2026, 2:18:45 PM
import java.util.*;

class Solution {

    public boolean checkIfExist(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(2 * num) ||
                (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}