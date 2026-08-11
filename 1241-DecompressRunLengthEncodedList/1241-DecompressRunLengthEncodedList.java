// Last updated: 8/11/2026, 2:19:16 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        // Calculate the size of the output array
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] result = new int[size];
        int index = 0;

        // Fill the output array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq-- > 0) {
                result[index++] = val;
            }
        }

        return result;
    }
}