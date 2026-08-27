class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int j = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>goal){
                sum-=nums[j];
                j++;
            }
            if(sum==goal){
                int k = j;
                while(k<=i && nums[k]==0){
                    count++;
                    k++;
                }
                if(k<=i && nums[k]==1) count++;

            }
        }
        return count;
    }
}