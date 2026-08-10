class Solution {
    int partitions(int nums[],int mid){
        int cnt = 1;
        int sum = 0;
        for(int num : nums){
            if(num+sum>mid){
                cnt++;
                sum = num;
            }
            else sum+=num;
        }
        return cnt;
    }
    
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        int ans = 0;
        for(int num:nums){
            if(num>low) low=num;
            high += num;
        } 
        while(low<=high){
            int mid = (low+high)/2;
            if(partitions(nums,mid)<=k){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}