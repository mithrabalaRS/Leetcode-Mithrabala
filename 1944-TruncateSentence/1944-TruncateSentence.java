// Last updated: 8/11/2026, 2:17:55 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            result.append(words[i]);

            if (i != k - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}