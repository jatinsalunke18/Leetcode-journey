class Solution {
    int first(int nums[],int x){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == x){
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid]>x){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
    int last(int nums[],int x){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==x){
                ans = mid;
                low = mid+1;
            }else if(nums[mid] < x){
                low = mid + 1;
            }
            else {
                high = mid-1; 
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
    }
}