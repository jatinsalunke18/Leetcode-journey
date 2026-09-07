class Solution {
    public int mod = (int) 1e9+7;
    public int distinctSubseqII(String s) {
        long[] last = new long[26];
        long total = 0;
        for(char c:s.toCharArray()){

            long newsubsequences = (total+1)%mod;
            total = (total + (total+1) - last[c-'a'] + mod)%mod;
            last[c-'a'] = newsubsequences;
        }
        return (int) total;
    }
}