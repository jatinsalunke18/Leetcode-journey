class Solution {
    int check(int[] nums,int mid){
        int ans = 0;
        for(int num:nums){
            ans+=(num+mid-1)/mid;
        }
        return ans;
    }
    int max(int[] nums){
        int ans = 0;
        for(int num:nums){
            ans = Math.max(num,ans);
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        while(low<=high){
            int mid = (low+high)/2;
            if(check(nums,mid)<=threshold){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}