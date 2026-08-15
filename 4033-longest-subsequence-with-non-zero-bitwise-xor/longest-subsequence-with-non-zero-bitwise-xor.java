class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        long sum = 0;
        for(int i=0;i<n;i++){
            xor ^= nums[i];
            sum+= nums[i];
        }
        if(sum==0) return 0;
        if(xor==0) return n-1;
        else return n;
    }
}