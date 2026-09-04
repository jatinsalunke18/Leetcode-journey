class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxarr = new int[nums.length];
        int[] minarr = new int[nums.length];
        int max = nums[0];
        int min = nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[nums.length-1-i],min);
            maxarr[i] = max;
            minarr[i] = min;
        }
        for(int i=0;i<nums.length;i++){
            if(((int)Math.abs(maxarr[i]-minarr[nums.length-i-1]))<=k) return i;
        }
        return -1;
    }
}