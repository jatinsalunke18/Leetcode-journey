class Solution {
    long cnt = 0;

    long func(long n) {
        long len = 0;
        long temp = n;

        while (temp >= 10) {
            temp /= 10;
            len++;
        }

        if (len < 3) return cnt;
        long p = 1;
        for (int i = 0; i < len; i++) {
            p *= 10;
        }
        cnt += (n - p + 1) * (len / 3);
        return func(p - 1);
    }

    public long countCommas(long n) {
        cnt = 0;
        return func(n);
    }
}