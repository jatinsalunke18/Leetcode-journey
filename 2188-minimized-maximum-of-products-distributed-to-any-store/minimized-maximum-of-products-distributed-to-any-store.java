class Solution {
    int product(int[] nums,int mid){
        int cnt = 0;
        for(int num:nums){
            cnt += (num+mid-1)/mid;
        }
        return cnt;
    }
    public int minimizedMaximum(int n, int[] nums) {
        int low = 1;
        int high = 0;
        if(n==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
        
        while(low<=high){
            int mid = (low)+(high-low)/2;
            if(product(nums,mid)<=n){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}