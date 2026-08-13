class Solution {
    int check(int[] nums,int mid){
        int cnt = 1;
        int sum = 0;
        for(int num:nums){
            if(sum+num>mid){
                cnt++;
                sum = num;
            }
            else sum+= num;
        }
        return cnt;
    }
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num:nums){
            low = Math.max(low,num);
            high += num;
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(nums,mid)<=k){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}