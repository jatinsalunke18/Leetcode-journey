class Solution {
    public int countCommas(int n) {
        int cnt = 0;
        for(int i=1000;i<=n;i++){
            int len = (int)Math.log10(i);
            cnt+= len/3;
        }
        return cnt;
    }
}