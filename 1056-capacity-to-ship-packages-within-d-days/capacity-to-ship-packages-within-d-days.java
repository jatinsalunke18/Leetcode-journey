class Solution {
    int check(int[] nums,int mid){
        int cnt = 1;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                cnt++;
                sum = nums[i];
            }
            else sum += nums[i];
        }
        return cnt;
    }
    public int shipWithinDays(int[] nums, int days) {
        if(nums.length == 1) return nums[0];
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num:nums){
            if(low<num) low = num;
            high += num;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(check(nums,mid)<=days){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}