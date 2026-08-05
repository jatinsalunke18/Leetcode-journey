class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]<=nums[high]) min = Math.min(nums[low],min);
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                low = mid+1;
            }
            else{
                min = Math.min(nums[mid],min);
                high = mid-1;
            }
        }
        return min;
    }
}