class Solution {
    int check(int [] nums,int mid){
        int cnt = 1;
        int last = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=mid){
                cnt++;
                last = nums[i];
            }
        }
        return cnt;
    }
    public int maxDistance(int[] position, int m) {
        int low = 1;
        int high = position[0];
        for(int i=0;i<position.length;i++){
            high = Math.max(high,position[i]);
        }
        Arrays.sort(position);
        while(low<=high){
            int mid = (low)+(high-low)/2;
            if(check(position,mid)>=m){
                low = mid+1;
            }
            else high = mid-1;
        }
        return high;
    }
}