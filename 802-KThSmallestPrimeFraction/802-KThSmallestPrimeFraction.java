// Last updated: 8/11/2026, 2:20:49 PM
class Solution {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        double left = 0.0;
        double right = 1.0;

        int p = 0, q = 1;

        while (true) {

            double mid = (left + right) / 2;

            int count = 0;
            p = 0;
            q = 1;

            int j = 1;

            for (int i = 0; i < arr.length - 1; i++) {

                while (j < arr.length &&
                        arr[i] > mid * arr[j]) {
                    j++;
                }

                if (j == arr.length)
                    break;

                count += arr.length - j;

                // Track largest fraction <= mid
                if ((long) p * arr[j] < (long) q * arr[i]) {
                    p = arr[i];
                    q = arr[j];
                }
            }

            if (count == k)
                return new int[]{p, q};

            if (count < k)
                left = mid;
            else
                right = mid;
        }
    }
}