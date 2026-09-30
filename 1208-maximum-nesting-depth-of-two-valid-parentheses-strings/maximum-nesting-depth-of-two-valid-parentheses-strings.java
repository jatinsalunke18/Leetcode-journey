class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int cnt = 0;
        int[] ans = new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                cnt++;
                ans[i] = cnt%2;
            }
            else{
                ans[i] = cnt%2;
                cnt--;
            }
        }
        return ans;
    }
}