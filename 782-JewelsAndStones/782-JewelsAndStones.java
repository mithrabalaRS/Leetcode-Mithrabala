// Last updated: 8/11/2026, 2:21:14 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char j : jewels.toCharArray()) {
            for (char s : stones.toCharArray()) {
                if (j == s) {
                    count++;
                }
            }
        }
        return count;
    }
}