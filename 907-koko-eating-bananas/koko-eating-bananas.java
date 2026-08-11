class Solution {
    long minhrs(int[] nums,int mid){
        long hrs = 0;
        for(int num:nums){
            hrs += ((long)(num+mid-1))/(long)mid;
        }
        return hrs;
    }
    public int minEatingSpeed(int[] nums, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = 0;
        for(int num:nums){
            if(num>high) high = num;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(minhrs(nums,mid)<=h){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}