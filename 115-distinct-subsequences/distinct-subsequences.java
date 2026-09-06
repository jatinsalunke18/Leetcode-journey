class Solution {
    int[][] dp;
    int func(int ind,int tind,String s,String t){
        if(tind==t.length()) return 1;
        if(ind==s.length()) return 0;
        if(dp[ind][tind] != -1) return dp[ind][tind];
        int cnt = 0;

        if(s.charAt(ind)==t.charAt(tind)){
            cnt+=func(ind+1,tind+1,s,t);
        }
        cnt += func(ind + 1, tind, s, t);

        return dp[ind][tind]=cnt;
    }
    public int numDistinct(String s, String t) {
        dp = new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return func(0,0,s,t);
    }
}