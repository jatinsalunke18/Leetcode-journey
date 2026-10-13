class Solution {
    public long maxAlternatingSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int greater = (nums.length / 2);
        if(nums.length % 2 == 1){
            greater++;
        }
        long sum = 0;
        while(i <= j){
            if(greater > 0){
                if(nums[i] * nums[i] >= nums[j] * nums[j]){
                    sum += (nums[i] * nums[i]);
                    greater--;
                    i++;
                }else{
                    sum += (nums[j] * nums[j]);
                    greater--;
                    j--;

                }
            }else{
                sum -= (long)(nums[i] * nums[i]);
                i++;
            }
            
        }
        return sum;
    }
}