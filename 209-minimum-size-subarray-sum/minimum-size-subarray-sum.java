class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int k=0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(sum>=target){
                len = Math.min(len,i-k+1);
                sum -= nums[k];
                k++;
            }
            // if(sum==target){
            //     len = Math.min(len,i-k+1);
            // }
        }
        if(len == Integer.MAX_VALUE) return 0;
        return len;
    }
}