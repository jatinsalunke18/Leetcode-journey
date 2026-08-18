class Solution {
    double check(int[] nums,double mid){
        double ans = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i != nums.length - 1) {
                ans += Math.ceil((double) nums[i] / mid);
            } else {
                ans += (double) nums[i] / mid;
            }
        }
        return ans;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        double low = 1;
        double high =Integer.MAX_VALUE;
        if(hour<=dist.length-1) return -1;
        while(low<=high){
            double mid = low+(high-low)/2;
            if(check(dist,mid)<=hour) high = mid-1;
            else low = mid+1;
        }
        return (int)Math.ceil(low);
    }
}