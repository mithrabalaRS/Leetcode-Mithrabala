// Last updated: 8/11/2026, 2:16:46 PM
import java.util.*;

class Solution {

    public int missingInteger(int[] nums) {

        int sum = nums[0];

        // Find longest sequential prefix
        int i = 1;

        while (i < nums.length &&
               nums[i] == nums[i - 1] + 1) {

            sum += nums[i];
            i++;
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Find smallest missing integer >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}