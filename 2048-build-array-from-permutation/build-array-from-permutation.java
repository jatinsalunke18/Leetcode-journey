class Solution {
    void func(int ind,int[] nums,int[] ans){
        if(ind==nums.length) return;
        ans[ind] = nums[nums[ind]];
        func(ind+1,nums,ans);
    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        func(0,nums,ans);
        return ans;
    }
}