class Solution {
    int maxSweetness(int[] a, int k) {
        long l = 1, r = 0, ans = 0;
        for (int x : a) r += x;

        while (l <= r) {
            long m = (l + r) / 2, sum = 0;
            int p = 0;

            for (int x : a) {
                sum += x;
                if (sum >= m) {
                    p++;
                    sum = 0;
                }
            }

            if (p >= k + 1) {
                ans = m;
                l = m + 1;
            } else r = m - 1;
        }
        return (int) ans;
    }
}