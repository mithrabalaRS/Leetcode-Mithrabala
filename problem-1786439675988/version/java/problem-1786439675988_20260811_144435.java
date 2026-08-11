// Last updated: 8/11/2026, 2:44:35 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        if (num < 2) {
4            return true;
5        }
6
7        int left = 1;
8        int right = num / 2;
9
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12            long square = (long) mid * mid;
13
14            if (square == num) {
15                return true;
16            } else if (square < num) {
17                left = mid + 1;
18            } else {
19                right = mid - 1;
20            }
21        }
22
23        return false;
24    }
25}