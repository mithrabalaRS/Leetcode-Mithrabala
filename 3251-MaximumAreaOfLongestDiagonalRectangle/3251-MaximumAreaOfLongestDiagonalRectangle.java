// Last updated: 8/11/2026, 2:16:38 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int length = rect[0];
            int width = rect[1];

            int diagonalSquared = length * length + width * width;
            int area = length * width;

            if (diagonalSquared > maxDiagonal) {
                maxDiagonal = diagonalSquared;
                maxArea = area;
            } else if (diagonalSquared == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}