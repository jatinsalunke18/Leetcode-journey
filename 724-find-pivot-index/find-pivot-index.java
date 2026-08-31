class Solution {
    int sum(int[] nums,int start,int end){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int leftsum = sum(nums,0,i-1);
            int rightsum = sum(nums,i+1,nums.length-1);
            if(leftsum==rightsum) return i;
        }
        return -1;
    }
}